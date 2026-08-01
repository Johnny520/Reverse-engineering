package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3384 extends AbstractC3412 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3618 f11034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3662 f11035;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3618 f11036;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3662 f11037;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3615 f11038;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "JavaFeaturesProto");
        C3615 c3615NewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(JavaFeaturesProto$JavaFeatures.class, JavaFeaturesProto$JavaFeatures.getDefaultInstance());
        f11038 = c3615NewFileScopedGeneratedExtension;
        C3655 c3655M7858 = C3655.m7858(new String[]{"\n#google/protobuf/java_features.proto\u0012\u0002pb\u001a google/protobuf/descriptor.proto\"ß\b\n\fJavaFeatures\u0012\u0090\u0002\n\u0012legacy_closed_enum\u0018\u0001 \u0001(\bBá\u0001\u0088\u0001\u0001\u0098\u0001\u0004\u0098\u0001\u0001¢\u0001\t\u0012\u0004true\u0018\u0084\u0007¢\u0001\n\u0012\u0005false\u0018ç\u0007²\u0001»\u0001\bè\u0007\u0010è\u0007\u001a²\u0001The legacy closed enum behavior in Java is deprecated and is scheduled to be removed in edition 2025.  See http://protobuf.dev/programming-guides/enum/#java for more information.R\u0010legacyClosedEnum\u0012¯\u0002\n\u000futf8_validation\u0018\u0002 \u0001(\u000e2\u001f.pb.JavaFeatures.Utf8ValidationBä\u0001\u0088\u0001\u0001\u0098\u0001\u0004\u0098\u0001\u0001¢\u0001\f\u0012\u0007DEFAULT\u0018\u0084\u0007²\u0001È\u0001\bè\u0007\u0010é\u0007\u001a¿\u0001The Java-specific utf8 validation feature is deprecated and is scheduled to be removed in edition 2025.  Utf8 validation behavior should use the global cross-language utf8_validation feature.R\u000eutf8Validation\u0012;\n\nlarge_enum\u0018\u0003 \u0001(\bB\u001c\u0088\u0001\u0001\u0098\u0001\u0006\u0098\u0001\u0001¢\u0001\n\u0012\u0005false\u0018\u0084\u0007²\u0001\u0003\bé\u0007R\tlargeEnum\u0012n\n\u001fuse_old_outer_classname_default\u0018\u0004 \u0001(\bB(\u0088\u0001\u0001\u0098\u0001\u0001¢\u0001\t\u0012\u0004true\u0018\u0084\u0007¢\u0001\n\u0012\u0005false\u0018é\u0007²\u0001\u0006\bé\u0007 é\u0007R\u001buseOldOuterClassnameDefault\u0012\u0090\u0001\n\u0012nest_in_file_class\u0018\u0005 \u0001(\u000e27.pb.JavaFeatures.NestInFileClassFeature.NestInFileClassB*\u0088\u0001\u0001\u0098\u0001\u0003\u0098\u0001\u0006\u0098\u0001\b¢\u0001\u000b\u0012\u0006LEGACY\u0018\u0084\u0007¢\u0001\u0007\u0012\u0002NO\u0018é\u0007²\u0001\u0003\bé\u0007R\u000fnestInFileClass\u001a|\n\u0016NestInFileClassFeature\"X\n\u000fNestInFileClass\u0012\u001e\n\u001aNEST_IN_FILE_CLASS_UNKNOWN\u0010\u0000\u0012\u0006\n\u0002NO\u0010\u0001\u0012\u0007\n\u0003YES\u0010\u0002\u0012\u0014\n\u0006LEGACY\u0010\u0003\u001a\b\"\u0006\bé\u0007 é\u0007J\b\b\u0001\u0010\u0080\u0080\u0080\u0080\u0002\"F\n\u000eUtf8Validation\u0012\u001b\n\u0017UTF8_VALIDATION_UNKNOWN\u0010\u0000\u0012\u000b\n\u0007DEFAULT\u0010\u0001\u0012\n\n\u0006VERIFY\u0010\u0002J\u0004\b\u0006\u0010\u0007:B\n\u0004java\u0012\u001b.google.protobuf.FeatureSet\u0018é\u0007 \u0001(\u000b2\u0010.pb.JavaFeaturesR\u0004javaB(\n\u0013com.google.protobufB\u0011JavaFeaturesProto"}, new C3655[]{AbstractC3669.f11452});
        C3662 c3662 = c3655M7858.f11335[0];
        f11037 = c3662;
        f11036 = new C3618(c3662, new String[]{"LegacyClosedEnum", "Utf8Validation", "LargeEnum", "UseOldOuterClassnameDefault", "NestInFileClass"});
        C3662 c36622 = c3662.f11371[0];
        f11035 = c36622;
        f11034 = new C3618(c36622, new String[0]);
        C3656 c3656 = c3655M7858.f11332[0];
        if (c3615NewFileScopedGeneratedExtension.f11257 != null) {
            C5919.m11250("Already initialized.");
        } else {
            c3615NewFileScopedGeneratedExtension.f11257 = new C3426(c3656);
            c3655M7858.m7859();
        }
    }
}
