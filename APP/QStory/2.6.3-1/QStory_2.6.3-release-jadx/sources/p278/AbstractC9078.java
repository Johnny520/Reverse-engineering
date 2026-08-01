package p278;

import com.google.protobuf.AbstractC4178;
import com.google.protobuf.AbstractC4245;
import com.google.protobuf.AbstractC4502;
import com.google.protobuf.C4451;
import com.google.protobuf.C4488;
import com.google.protobuf.C4495;
import com.google.protobuf.RuntimeVersion$RuntimeDomain;

/* JADX INFO: renamed from: 飘花落叶言楪哲世苏子兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9078 extends AbstractC4245 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4451 f23180;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4495 f23181;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4451 f23182;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4495 f23183;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4451 f23184;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4495 f23185;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C4451 f23186;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4495 f23187;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "PluginProtos");
        C4488 c4488M8404 = C4488.m8404(new String[]{"\n%google/protobuf/compiler/plugin.proto\u0012\u0018google.protobuf.compiler\u001a google/protobuf/descriptor.proto\"c\n\u0007Version\u0012\u0014\n\u0005major\u0018\u0001 \u0001(\u0005R\u0005major\u0012\u0014\n\u0005minor\u0018\u0002 \u0001(\u0005R\u0005minor\u0012\u0014\n\u0005patch\u0018\u0003 \u0001(\u0005R\u0005patch\u0012\u0016\n\u0006suffix\u0018\u0004 \u0001(\tR\u0006suffix\"Ï\u0002\n\u0014CodeGeneratorRequest\u0012(\n\u0010file_to_generate\u0018\u0001 \u0003(\tR\u000efileToGenerate\u0012\u001c\n\tparameter\u0018\u0002 \u0001(\tR\tparameter\u0012C\n\nproto_file\u0018\u000f \u0003(\u000b2$.google.protobuf.FileDescriptorProtoR\tprotoFile\u0012\\\n\u0017source_file_descriptors\u0018\u0011 \u0003(\u000b2$.google.protobuf.FileDescriptorProtoR\u0015sourceFileDescriptors\u0012L\n\u0010compiler_version\u0018\u0003 \u0001(\u000b2!.google.protobuf.compiler.VersionR\u000fcompilerVersion\"\u0085\u0004\n\u0015CodeGeneratorResponse\u0012\u0014\n\u0005error\u0018\u0001 \u0001(\tR\u0005error\u0012-\n\u0012supported_features\u0018\u0002 \u0001(\u0004R\u0011supportedFeatures\u0012'\n\u000fminimum_edition\u0018\u0003 \u0001(\u0005R\u000eminimumEdition\u0012'\n\u000fmaximum_edition\u0018\u0004 \u0001(\u0005R\u000emaximumEdition\u0012H\n\u0004file\u0018\u000f \u0003(\u000b24.google.protobuf.compiler.CodeGeneratorResponse.FileR\u0004file\u001a±\u0001\n\u0004File\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012'\n\u000finsertion_point\u0018\u0002 \u0001(\tR\u000einsertionPoint\u0012\u0018\n\u0007content\u0018\u000f \u0001(\tR\u0007content\u0012R\n\u0013generated_code_info\u0018\u0010 \u0001(\u000b2\".google.protobuf.GeneratedCodeInfoR\u0011generatedCodeInfo\"W\n\u0007Feature\u0012\u0010\n\fFEATURE_NONE\u0010\u0000\u0012\u001b\n\u0017FEATURE_PROTO3_OPTIONAL\u0010\u0001\u0012\u001d\n\u0019FEATURE_SUPPORTS_EDITIONS\u0010\u0002Br\n\u001ccom.google.protobuf.compilerB\fPluginProtosZ)google.golang.org/protobuf/types/pluginpbª\u0002\u0018Google.Protobuf.Compiler"}, new C4488[]{AbstractC4502.f11802});
        C4495[] c4495Arr = c4488M8404.f11685;
        C4495 c4495 = c4495Arr[0];
        f23185 = c4495;
        f23184 = new C4451(c4495, new String[]{"Major", "Minor", "Patch", "Suffix"});
        C4495 c44952 = c4495Arr[1];
        f23183 = c44952;
        f23182 = new C4451(c44952, new String[]{"FileToGenerate", "Parameter", "ProtoFile", "SourceFileDescriptors", "CompilerVersion"});
        C4495 c44953 = c4495Arr[2];
        f23181 = c44953;
        f23180 = new C4451(c44953, new String[]{"Error", "SupportedFeatures", "MinimumEdition", "MaximumEdition", "File"});
        C4495 c44954 = c44953.f11721[0];
        f23187 = c44954;
        f23186 = new C4451(c44954, new String[]{"Name", "InsertionPoint", "Content", "GeneratedCodeInfo"});
        c4488M8404.m8405();
    }
}
