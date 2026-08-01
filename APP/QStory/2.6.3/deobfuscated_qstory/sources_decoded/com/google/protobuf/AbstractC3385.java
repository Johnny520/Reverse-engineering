package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3385 extends AbstractC3413 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3619 f11039;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3663 f11040;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3619 f11041;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3663 f11042;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3616 f11043;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "JavaFeaturesProto");
        C3616 c3616NewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(JavaFeaturesProto$JavaFeatures.class, JavaFeaturesProto$JavaFeatures.getDefaultInstance());
        f11043 = c3616NewFileScopedGeneratedExtension;
        C3656 c3656M7845 = C3656.m7845(new String[]{"\n#google/protobuf/java_features.proto\u0012\u0002pb\u001a google/protobuf/descriptor.proto\"ß\b\n\fJavaFeatures\u0012\u0090\u0002\n\u0012legacy_closed_enum\u0018\u0001 \u0001(\bBá\u0001\u0088\u0001\u0001\u0098\u0001\u0004\u0098\u0001\u0001¢\u0001\t\u0012\u0004true\u0018\u0084\u0007¢\u0001\n\u0012\u0005false\u0018ç\u0007²\u0001»\u0001\bè\u0007\u0010è\u0007\u001a²\u0001The legacy closed enum behavior in Java is deprecated and is scheduled to be removed in edition 2025.  See http://protobuf.dev/programming-guides/enum/#java for more information.R\u0010legacyClosedEnum\u0012¯\u0002\n\u000futf8_validation\u0018\u0002 \u0001(\u000e2\u001f.pb.JavaFeatures.Utf8ValidationBä\u0001\u0088\u0001\u0001\u0098\u0001\u0004\u0098\u0001\u0001¢\u0001\f\u0012\u0007DEFAULT\u0018\u0084\u0007²\u0001È\u0001\bè\u0007\u0010é\u0007\u001a¿\u0001The Java-specific utf8 validation feature is deprecated and is scheduled to be removed in edition 2025.  Utf8 validation behavior should use the global cross-language utf8_validation feature.R\u000eutf8Validation\u0012;\n\nlarge_enum\u0018\u0003 \u0001(\bB\u001c\u0088\u0001\u0001\u0098\u0001\u0006\u0098\u0001\u0001¢\u0001\n\u0012\u0005false\u0018\u0084\u0007²\u0001\u0003\bé\u0007R\tlargeEnum\u0012n\n\u001fuse_old_outer_classname_default\u0018\u0004 \u0001(\bB(\u0088\u0001\u0001\u0098\u0001\u0001¢\u0001\t\u0012\u0004true\u0018\u0084\u0007¢\u0001\n\u0012\u0005false\u0018é\u0007²\u0001\u0006\bé\u0007 é\u0007R\u001buseOldOuterClassnameDefault\u0012\u0090\u0001\n\u0012nest_in_file_class\u0018\u0005 \u0001(\u000e27.pb.JavaFeatures.NestInFileClassFeature.NestInFileClassB*\u0088\u0001\u0001\u0098\u0001\u0003\u0098\u0001\u0006\u0098\u0001\b¢\u0001\u000b\u0012\u0006LEGACY\u0018\u0084\u0007¢\u0001\u0007\u0012\u0002NO\u0018é\u0007²\u0001\u0003\bé\u0007R\u000fnestInFileClass\u001a|\n\u0016NestInFileClassFeature\"X\n\u000fNestInFileClass\u0012\u001e\n\u001aNEST_IN_FILE_CLASS_UNKNOWN\u0010\u0000\u0012\u0006\n\u0002NO\u0010\u0001\u0012\u0007\n\u0003YES\u0010\u0002\u0012\u0014\n\u0006LEGACY\u0010\u0003\u001a\b\"\u0006\bé\u0007 é\u0007J\b\b\u0001\u0010\u0080\u0080\u0080\u0080\u0002\"F\n\u000eUtf8Validation\u0012\u001b\n\u0017UTF8_VALIDATION_UNKNOWN\u0010\u0000\u0012\u000b\n\u0007DEFAULT\u0010\u0001\u0012\n\n\u0006VERIFY\u0010\u0002J\u0004\b\u0006\u0010\u0007:B\n\u0004java\u0012\u001b.google.protobuf.FeatureSet\u0018é\u0007 \u0001(\u000b2\u0010.pb.JavaFeaturesR\u0004javaB(\n\u0013com.google.protobufB\u0011JavaFeaturesProto"}, new C3656[]{AbstractC3670.f11457});
        C3663 c3663 = c3656M7845.f11340[0];
        f11042 = c3663;
        f11041 = new C3619(c3663, new String[]{"LegacyClosedEnum", "Utf8Validation", "LargeEnum", "UseOldOuterClassnameDefault", "NestInFileClass"});
        C3663 c36632 = c3663.f11376[0];
        f11040 = c36632;
        f11039 = new C3619(c36632, new String[0]);
        C3657 c3657 = c3656M7845.f11337[0];
        if (c3616NewFileScopedGeneratedExtension.f11262 != null) {
            C5925.m11311("Already initialized.");
        } else {
            c3616NewFileScopedGeneratedExtension.f11262 = new C3427(c3657);
            c3656M7845.m7846();
        }
    }
}
