package com.eagle.arbitrage.contract;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 5.0.0.
 */
@SuppressWarnings("rawtypes")
public class Eagle extends Contract {
    public static final String BINARY = "0x6080604052336000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555034801561005057600080fd5b50612696806100606000396000f3fe6080604052600436106100595760003560e01c8063306652531461006557806362d92794146101f2578063880cdc311461037f5780638da5cb5b146103d0578063bd9b6d8614610411578063f3fef3a31461042857610060565b3661006057005b600080fd5b34801561007157600080fd5b506101f0600480360360a081101561008857600080fd5b810190808035906020019092919080359060200190929190803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803590602001906401000000008111156100d957600080fd5b8201836020820111156100eb57600080fd5b8035906020019184602083028401116401000000008311171561010d57600080fd5b919080806020026020016040519081016040528093929190818152602001838360200280828437600081840152601f19601f8201169050808301925050505050505091929192908035906020019064010000000081111561016d57600080fd5b82018360208201111561017f57600080fd5b803590602001918460208302840111640100000000831117156101a157600080fd5b919080806020026020016040519081016040528093929190818152602001838360200280828437600081840152601f19601f820116905080830192505050505050509192919290505050610483565b005b3480156101fe57600080fd5b5061037d600480360360a081101561021557600080fd5b810190808035906020019092919080359060200190929190803573ffffffffffffffffffffffffffffffffffffffff1690602001909291908035906020019064010000000081111561026657600080fd5b82018360208201111561027857600080fd5b8035906020019184602083028401116401000000008311171561029a57600080fd5b919080806020026020016040519081016040528093929190818152602001838360200280828437600081840152601f19601f820116905080830192505050505050509192919290803590602001906401000000008111156102fa57600080fd5b82018360208201111561030c57600080fd5b8035906020019184602083028401116401000000008311171561032e57600080fd5b919080806020026020016040519081016040528093929190818152602001838360200280828437600081840152601f19601f820116905080830192505050505050509192919290505050610fd8565b005b34801561038b57600080fd5b506103ce600480360360208110156103a257600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff1690602001909291905050506117b8565b005b3480156103dc57600080fd5b506103e56118bd565b604051808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34801561041d57600080fd5b506104266118e1565b005b34801561043457600080fd5b506104816004803603604081101561044b57600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190505050611a08565b005b60005a9050858510156104fe576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260028152602001807f233000000000000000000000000000000000000000000000000000000000000081525060200191505060405180910390fd5b6000849050600087905060005b84518110156107a357600085828151811061052257fe5b6020026020010151905060008173ffffffffffffffffffffffffffffffffffffffff16630dfe16816040518163ffffffff1660e01b815260040160206040518083038186803b15801561057457600080fd5b505afa158015610588573d6000803e3d6000fd5b505050506040513d602081101561059e57600080fd5b810190808051906020019092919050505090506000808373ffffffffffffffffffffffffffffffffffffffff16630902f1ac6040518163ffffffff1660e01b815260040160606040518083038186803b1580156105fa57600080fd5b505afa15801561060e573d6000803e3d6000fd5b505050506040513d606081101561062457600080fd5b81019080805190602001909291908051906020019092919080519060200190929190505050506dffffffffffffffffffffffffffff1691506dffffffffffffffffffffffffffff1691506000808873ffffffffffffffffffffffffffffffffffffffff168573ffffffffffffffffffffffffffffffffffffffff16146106ab5782846106ae565b83835b915091508873ffffffffffffffffffffffffffffffffffffffff168573ffffffffffffffffffffffffffffffffffffffff16146106eb578461076d565b8573ffffffffffffffffffffffffffffffffffffffff1663d21220a76040518163ffffffff1660e01b815260040160206040518083038186803b15801561073157600080fd5b505afa158015610745573d6000803e3d6000fd5b505050506040513d602081101561075b57600080fd5b81019080805190602001909291905050505b985061078e8883838f8b8151811061078157fe5b6020026020010151611c48565b9750505050505050808060010191505061050b565b508681101561081a576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260028152602001807f233100000000000000000000000000000000000000000000000000000000000081525060200191505060405180910390fd5b5061083a858460008151811061082c57fe5b602002602001015189611db5565b60008573ffffffffffffffffffffffffffffffffffffffff166370a08231306040518263ffffffff1660e01b8152600401808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060206040518083038186803b1580156108a357600080fd5b505afa1580156108b7573d6000803e3d6000fd5b505050506040513d60208110156108cd57600080fd5b8101908080519060200190929190505050905085915060005b8451811015610dfc5760008582815181106108fd57fe5b6020026020010151905060008173ffffffffffffffffffffffffffffffffffffffff16630dfe16816040518163ffffffff1660e01b815260040160206040518083038186803b15801561094f57600080fd5b505afa158015610963573d6000803e3d6000fd5b505050506040513d602081101561097957600080fd5b810190808051906020019092919050505090506000806000808573ffffffffffffffffffffffffffffffffffffffff16630902f1ac6040518163ffffffff1660e01b815260040160606040518083038186803b1580156109d857600080fd5b505afa1580156109ec573d6000803e3d6000fd5b505050506040513d6060811015610a0257600080fd5b81019080805190602001909291908051906020019092919080519060200190929190505050506dffffffffffffffffffffffffffff1691506dffffffffffffffffffffffffffff1691508873ffffffffffffffffffffffffffffffffffffffff168573ffffffffffffffffffffffffffffffffffffffff1614610a86578082610a89565b81815b80945081955050505050600080610b4a848a73ffffffffffffffffffffffffffffffffffffffff166370a08231896040518263ffffffff1660e01b8152600401808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060206040518083038186803b158015610b0157600080fd5b505afa158015610b15573d6000803e3d6000fd5b505050506040513d6020811015610b2b57600080fd5b8101908080519060200190929190505050611f9790919063ffffffff16565b9050610b6b8185858f8b81518110610b5e57fe5b6020026020010151611c48565b9150506000808973ffffffffffffffffffffffffffffffffffffffff168673ffffffffffffffffffffffffffffffffffffffff1614610bac57826000610bb0565b6000835b91509150600060018d51038910610bc75730610bdf565b8c60018a0181518110610bd657fe5b60200260200101515b90508773ffffffffffffffffffffffffffffffffffffffff1663022c0d9f848484600067ffffffffffffffff81118015610c1857600080fd5b506040519080825280601f01601f191660200182016040528015610c4b5781602001600182028036833780820191505090505b506040518563ffffffff1660e01b8152600401808581526020018481526020018373ffffffffffffffffffffffffffffffffffffffff16815260200180602001828103825283818151815260200191508051906020019080838360005b83811015610cc3578082015181840152602081019050610ca8565b50505050905090810190601f168015610cf05780820380516001836020036101000a031916815260200191505b5095505050505050600060405180830381600087803b158015610d1257600080fd5b505af1158015610d26573d6000803e3d6000fd5b505050508a73ffffffffffffffffffffffffffffffffffffffff168773ffffffffffffffffffffffffffffffffffffffff1614610d635786610de5565b8773ffffffffffffffffffffffffffffffffffffffff1663d21220a76040518163ffffffff1660e01b815260040160206040518083038186803b158015610da957600080fd5b505afa158015610dbd573d6000803e3d6000fd5b505050506040513d6020811015610dd357600080fd5b81019080805190602001909291905050505b9a50505050505050505080806001019150506108e6565b5086610eb2828873ffffffffffffffffffffffffffffffffffffffff166370a08231306040518263ffffffff1660e01b8152600401808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060206040518083038186803b158015610e6957600080fd5b505afa158015610e7d573d6000803e3d6000fd5b505050506040513d6020811015610e9357600080fd5b8101908080519060200190929190505050611f9790919063ffffffff16565b1015610f26576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260028152602001807f233200000000000000000000000000000000000000000000000000000000000081525060200191505060405180910390fd5b505060008036905060100261520801905060005a838301039050600061a3db61374a830181610f5157fe5b0490506d4946c0e9f43f4dee607b0ef1fa1c73ffffffffffffffffffffffffffffffffffffffff1663d8ccd0f3826040518263ffffffff1660e01b815260040180828152602001915050600060405180830381600087803b158015610fb557600080fd5b505af1158015610fc9573d6000803e3d6000fd5b50505050505050505050505050565b60005a905085851015611053576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260028152602001807f233000000000000000000000000000000000000000000000000000000000000081525060200191505060405180910390fd5b600080611060868561201a565b91509150600088905060005b60018451038110156110f4576110e58284838151811061108857fe5b602002602001015160008151811061109c57fe5b60200260200101518584815181106110b057fe5b60200260200101516001815181106110c457fe5b60200260200101518a85815181106110d857fe5b6020026020010151611c48565b9150808060010191505061106c565b508781101561116b576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260028152602001807f233100000000000000000000000000000000000000000000000000000000000081525060200191505060405180910390fd5b5061118b868560008151811061117d57fe5b60200260200101518a611db5565b60008673ffffffffffffffffffffffffffffffffffffffff166370a08231306040518263ffffffff1660e01b8152600401808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060206040518083038186803b1580156111f457600080fd5b505afa158015611208573d6000803e3d6000fd5b505050506040513d602081101561121e57600080fd5b8101908080519060200190929190505050905060008067ffffffffffffffff8111801561124a57600080fd5b506040519080825280601f01601f19166020018201604052801561127d5781602001600182028036833780820191505090505b50905060005b60018551038110156115da5760006112c48683815181106112a057fe5b60200260200101518760018501815181106112b757fe5b6020026020010151612456565b50905060008883815181106112d557fe5b6020026020010151905060006113cf8785815181106112f057fe5b602002602001015160008151811061130457fe5b602002602001015189868151811061131857fe5b602002602001015173ffffffffffffffffffffffffffffffffffffffff166370a08231856040518263ffffffff1660e01b8152600401808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060206040518083038186803b15801561138657600080fd5b505afa15801561139a573d6000803e3d6000fd5b505050506040513d60208110156113b057600080fd5b8101908080519060200190929190505050611f9790919063ffffffff16565b90506000611440828987815181106113e357fe5b60200260200101516000815181106113f757fe5b60200260200101518a888151811061140b57fe5b602002602001015160018151811061141f57fe5b60200260200101518f898151811061143357fe5b6020026020010151611c48565b90506000808573ffffffffffffffffffffffffffffffffffffffff168b888151811061146857fe5b602002602001015173ffffffffffffffffffffffffffffffffffffffff161461149357826000611497565b6000835b91509150600060028c510388106114ae57306114c6565b8d60018901815181106114bd57fe5b60200260200101515b90508573ffffffffffffffffffffffffffffffffffffffff1663022c0d9f8484848d6040518563ffffffff1660e01b8152600401808581526020018481526020018373ffffffffffffffffffffffffffffffffffffffff16815260200180602001828103825283818151815260200191508051906020019080838360005b8381101561155f578082015181840152602081019050611544565b50505050905090810190601f16801561158c5780820380516001836020036101000a031916815260200191505b5095505050505050600060405180830381600087803b1580156115ae57600080fd5b505af11580156115c2573d6000803e3d6000fd5b50505050505050505050508080600101915050611283565b5088611690838a73ffffffffffffffffffffffffffffffffffffffff166370a08231306040518263ffffffff1660e01b8152600401808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060206040518083038186803b15801561164757600080fd5b505afa15801561165b573d6000803e3d6000fd5b505050506040513d602081101561167157600080fd5b8101908080519060200190929190505050611f9790919063ffffffff16565b1015611704576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260028152602001807f233200000000000000000000000000000000000000000000000000000000000081525060200191505060405180910390fd5b5050505060008036905060100261520801905060005a838301039050600061a3db61374a83018161173157fe5b0490506d4946c0e9f43f4dee607b0ef1fa1c73ffffffffffffffffffffffffffffffffffffffff1663d8ccd0f3826040518263ffffffff1660e01b815260040180828152602001915050600060405180830381600087803b15801561179557600080fd5b505af11580156117a9573d6000803e3d6000fd5b50505050505050505050505050565b60008054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614611879576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260158152602001807f4f776e6572206e6f7420617574686f72697a65642e000000000000000000000081525060200191505060405180910390fd5b80600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555050565b60008054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16146119a4576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260188152602001807f4e65774f776e6572206e6f7420617574686f72697a65642e000000000000000081525060200191505060405180910390fd5b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff166000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550565b60008054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614611ac9576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260158152602001807f4f776e6572206e6f7420617574686f72697a65642e000000000000000000000081525060200191505060405180910390fd5b6000811415611b77578173ffffffffffffffffffffffffffffffffffffffff166370a08231306040518263ffffffff1660e01b8152600401808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060206040518083038186803b158015611b3957600080fd5b505afa158015611b4d573d6000803e3d6000fd5b505050506040513d6020811015611b6357600080fd5b810190808051906020019092919050505090505b8173ffffffffffffffffffffffffffffffffffffffff1663a9059cbb60008054906101000a900473ffffffffffffffffffffffffffffffffffffffff16836040518363ffffffff1660e01b8152600401808373ffffffffffffffffffffffffffffffffffffffff16815260200182815260200192505050602060405180830381600087803b158015611c0857600080fd5b505af1158015611c1c573d6000803e3d6000fd5b505050506040513d6020811015611c3257600080fd5b8101908080519060200190929190505050505050565b6000808511611cbf576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260198152602001807f494e53554646494349454e545f494e5055545f414d4f554e540000000000000081525060200191505060405180910390fd5b600084118015611ccf5750600083115b611d41576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260168152602001807f494e53554646494349454e545f4c49515549444954590000000000000000000081525060200191505060405180910390fd5b6000611d5a83612710038761254890919063ffffffff16565b90506000611d71858361254890919063ffffffff16565b90506000611d9c83611d8e6127108a61254890919063ffffffff16565b6125dd90919063ffffffff16565b9050808281611da757fe5b049350505050949350505050565b6000808473ffffffffffffffffffffffffffffffffffffffff1663a9059cbb8585604051602401808373ffffffffffffffffffffffffffffffffffffffff168152602001828152602001925050506040516020818303038152906040529060e01b6020820180517bffffffffffffffffffffffffffffffffffffffffffffffffffffffff83818316178352505050506040518082805190602001908083835b60208310611e775780518252602082019150602081019050602083039250611e54565b6001836020036101000a0380198251168184511680821785525050505050509050019150506000604051808303816000865af19150503d8060008114611ed9576040519150601f19603f3d011682016040523d82523d6000602084013e611ede565b606091505b5091509150818015611f1e5750600081511480611f1d5750808060200190516020811015611f0b57600080fd5b81019080805190602001909291905050505b5b611f90576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040180806020018281038252600f8152602001807f5452414e534645525f4641494c4544000000000000000000000000000000000081525060200191505060405180910390fd5b5050505050565b6000828284039150811115612014576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260158152602001807f64732d6d6174682d7375622d756e646572666c6f77000000000000000000000081525060200191505060405180910390fd5b92915050565b606080600183510167ffffffffffffffff8111801561203857600080fd5b506040519080825280602002602001820160405280156120675781602001602082028036833780820191505090505b509150825167ffffffffffffffff8111801561208257600080fd5b506040519080825280602002602001820160405280156120b657816020015b60608152602001906001900390816120a15790505b50905083826000815181106120c757fe5b602002602001019073ffffffffffffffffffffffffffffffffffffffff16908173ffffffffffffffffffffffffffffffffffffffff168152505060005b835181101561244e57600084828151811061211b57fe5b6020026020010151905060008173ffffffffffffffffffffffffffffffffffffffff16630dfe16816040518163ffffffff1660e01b815260040160206040518083038186803b15801561216d57600080fd5b505afa158015612181573d6000803e3d6000fd5b505050506040513d602081101561219757600080fd5b8101908080519060200190929190505050905060008273ffffffffffffffffffffffffffffffffffffffff1663d21220a76040518163ffffffff1660e01b815260040160206040518083038186803b1580156121f257600080fd5b505afa158015612206573d6000803e3d6000fd5b505050506040513d602081101561221c57600080fd5b810190808051906020019092919050505090506000808473ffffffffffffffffffffffffffffffffffffffff16630902f1ac6040518163ffffffff1660e01b815260040160606040518083038186803b15801561227857600080fd5b505afa15801561228c573d6000803e3d6000fd5b505050506040513d60608110156122a257600080fd5b81019080805190602001909291908051906020019092919080519060200190929190505050506dffffffffffffffffffffffffffff1691506dffffffffffffffffffffffffffff169150600267ffffffffffffffff8111801561230457600080fd5b506040519080825280602002602001820160405280156123335781602001602082028036833780820191505090505b5087878151811061234057fe5b602002602001018190525087868151811061235757fe5b602002602001015173ffffffffffffffffffffffffffffffffffffffff168473ffffffffffffffffffffffffffffffffffffffff16146123995783818361239d565b8282825b8a60018a01815181106123ac57fe5b602002602001018a8a815181106123bf57fe5b60200260200101516000815181106123d357fe5b602002602001018b8b815181106123e657fe5b60200260200101516001815181106123fa57fe5b6020026020010183815250838152508373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681525050505050505050508080600101915050612104565b509250929050565b6000808273ffffffffffffffffffffffffffffffffffffffff168473ffffffffffffffffffffffffffffffffffffffff1610612493578284612496565b83835b8092508193505050600073ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff161415612541576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040180806020018281038252600c8152602001807f5a45524f5f41444452455353000000000000000000000000000000000000000081525060200191505060405180910390fd5b9250929050565b600080821480612565575082828385029250828161256257fe5b04145b6125d7576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260148152602001807f64732d6d6174682d6d756c2d6f766572666c6f7700000000000000000000000081525060200191505060405180910390fd5b92915050565b600082828401915081101561265a576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260148152602001807f64732d6d6174682d6164642d6f766572666c6f7700000000000000000000000081525060200191505060405180910390fd5b9291505056fea264697066735822122023244d3dd2c14141dfc02a0951923de81e12eabff08b2756abf6b9faa8cd65af64736f6c63430007060033";

    public static final String FUNC_OWNER = "owner";

    public static final String FUNC_WITHDRAW = "withdraw";

    public static final String FUNC_UPDATEOWNER = "updateOwner";

    public static final String FUNC_CONFIRMOWNER = "confirmOwner";

    public static final String FUNC_HUNTINGV1 = "huntingV1";

    public static final String FUNC_HUNTINGV2 = "huntingV2";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
        _addresses.put("56", "0x0eBF35E640A300fA8187d827ecFa6e9c7D2e8543");
    }

    @Deprecated
    protected Eagle(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Eagle(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Eagle(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Eagle(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> owner() {
        final Function function = new Function(FUNC_OWNER,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {
                }));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> withdraw(String token, BigInteger amount) {
        final Function function = new Function(
                FUNC_WITHDRAW,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(token),
                        new org.web3j.abi.datatypes.generated.Uint256(amount)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> updateOwner(String _newOwner) {
        final Function function = new Function(
                FUNC_UPDATEOWNER,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_newOwner)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> confirmOwner() {
        final Function function = new Function(
                FUNC_CONFIRMOWNER,
                Arrays.<Type>asList(),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> huntingV1(BigInteger amountIn, BigInteger amountOutMin, String token, List<BigInteger> swapFees, List<String> pairs) {
        final Function function = new Function(
                FUNC_HUNTINGV1,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountIn),
                        new org.web3j.abi.datatypes.generated.Uint256(amountOutMin),
                        new org.web3j.abi.datatypes.Address(token),
                        new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                                org.web3j.abi.datatypes.generated.Uint256.class,
                                org.web3j.abi.Utils.typeMap(swapFees, org.web3j.abi.datatypes.generated.Uint256.class)),
                        new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                                org.web3j.abi.datatypes.Address.class,
                                org.web3j.abi.Utils.typeMap(pairs, org.web3j.abi.datatypes.Address.class))),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> huntingV2(BigInteger amountIn, BigInteger amountOutMin, String token, List<BigInteger> swapFees, List<String> pairs) {
        final Function function = new Function(
                FUNC_HUNTINGV2,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountIn),
                        new org.web3j.abi.datatypes.generated.Uint256(amountOutMin),
                        new org.web3j.abi.datatypes.Address(token),
                        new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                                org.web3j.abi.datatypes.generated.Uint256.class,
                                org.web3j.abi.Utils.typeMap(swapFees, org.web3j.abi.datatypes.generated.Uint256.class)),
                        new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                                org.web3j.abi.datatypes.Address.class,
                                org.web3j.abi.Utils.typeMap(pairs, org.web3j.abi.datatypes.Address.class))),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static Function hunting_v1Function(BigInteger amountIn, BigInteger amountOutMin, String token, List<BigInteger> swapFees, List<String> pairs) {
        final Function function = new Function(
                FUNC_HUNTINGV1,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountIn),
                        new org.web3j.abi.datatypes.generated.Uint256(amountOutMin),
                        new org.web3j.abi.datatypes.Address(token),
                        new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                                org.web3j.abi.datatypes.generated.Uint256.class,
                                org.web3j.abi.Utils.typeMap(swapFees, org.web3j.abi.datatypes.generated.Uint256.class)),
                        new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                                org.web3j.abi.datatypes.Address.class,
                                org.web3j.abi.Utils.typeMap(pairs, org.web3j.abi.datatypes.Address.class))),
                Collections.<TypeReference<?>>emptyList());
        return function;
    }

    public static Function hunting_v2Function(BigInteger amountIn, BigInteger amountOutMin, String token, List<BigInteger> swapFees, List<String> pairs) {
        final Function function = new Function(
                FUNC_HUNTINGV2,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amountIn),
                        new org.web3j.abi.datatypes.generated.Uint256(amountOutMin),
                        new org.web3j.abi.datatypes.Address(token),
                        new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                                org.web3j.abi.datatypes.generated.Uint256.class,
                                org.web3j.abi.Utils.typeMap(swapFees, org.web3j.abi.datatypes.generated.Uint256.class)),
                        new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                                org.web3j.abi.datatypes.Address.class,
                                org.web3j.abi.Utils.typeMap(pairs, org.web3j.abi.datatypes.Address.class))),
                Collections.<TypeReference<?>>emptyList());
        return function;
    }

    @Deprecated
    public static Eagle load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Eagle(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Eagle load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Eagle(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Eagle load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Eagle(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Eagle load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Eagle(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Eagle> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Eagle.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Eagle> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Eagle.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Eagle> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Eagle.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Eagle> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Eagle.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }
}
