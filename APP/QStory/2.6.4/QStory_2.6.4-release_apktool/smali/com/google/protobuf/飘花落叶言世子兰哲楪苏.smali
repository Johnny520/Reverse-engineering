.class public abstract Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;
.super Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

.field public static final 飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

.field public static final 飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

.field public static final 飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

.field public static final 飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    sget-object v0, Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;->PUBLIC:Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;

    .line 2
    .line 3
    const-string v1, "JavaFeaturesProto"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/protobuf/飘花落叶言世兰子苏楪哲;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-class v0, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    .line 9
    .line 10
    invoke-static {}, Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;->getDefaultInstance()Lcom/google/protobuf/JavaFeaturesProto$JavaFeatures;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v0, v1}, Lcom/google/protobuf/GeneratedMessage;->newFileScopedGeneratedExtension(Ljava/lang/Class;Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;

    .line 19
    .line 20
    const-string v1, "\n#google/protobuf/java_features.proto\u0012\u0002pb\u001a google/protobuf/descriptor.proto\"\u00df\u0008\n\u000cJavaFeatures\u0012\u0090\u0002\n\u0012legacy_closed_enum\u0018\u0001 \u0001(\u0008B\u00e1\u0001\u0088\u0001\u0001\u0098\u0001\u0004\u0098\u0001\u0001\u00a2\u0001\t\u0012\u0004true\u0018\u0084\u0007\u00a2\u0001\n\u0012\u0005false\u0018\u00e7\u0007\u00b2\u0001\u00bb\u0001\u0008\u00e8\u0007\u0010\u00e8\u0007\u001a\u00b2\u0001The legacy closed enum behavior in Java is deprecated and is scheduled to be removed in edition 2025.  See http://protobuf.dev/programming-guides/enum/#java for more information.R\u0010legacyClosedEnum\u0012\u00af\u0002\n\u000futf8_validation\u0018\u0002 \u0001(\u000e2\u001f.pb.JavaFeatures.Utf8ValidationB\u00e4\u0001\u0088\u0001\u0001\u0098\u0001\u0004\u0098\u0001\u0001\u00a2\u0001\u000c\u0012\u0007DEFAULT\u0018\u0084\u0007\u00b2\u0001\u00c8\u0001\u0008\u00e8\u0007\u0010\u00e9\u0007\u001a\u00bf\u0001The Java-specific utf8 validation feature is deprecated and is scheduled to be removed in edition 2025.  Utf8 validation behavior should use the global cross-language utf8_validation feature.R\u000eutf8Validation\u0012;\n\nlarge_enum\u0018\u0003 \u0001(\u0008B\u001c\u0088\u0001\u0001\u0098\u0001\u0006\u0098\u0001\u0001\u00a2\u0001\n\u0012\u0005false\u0018\u0084\u0007\u00b2\u0001\u0003\u0008\u00e9\u0007R\tlargeEnum\u0012n\n\u001fuse_old_outer_classname_default\u0018\u0004 \u0001(\u0008B(\u0088\u0001\u0001\u0098\u0001\u0001\u00a2\u0001\t\u0012\u0004true\u0018\u0084\u0007\u00a2\u0001\n\u0012\u0005false\u0018\u00e9\u0007\u00b2\u0001\u0006\u0008\u00e9\u0007 \u00e9\u0007R\u001buseOldOuterClassnameDefault\u0012\u0090\u0001\n\u0012nest_in_file_class\u0018\u0005 \u0001(\u000e27.pb.JavaFeatures.NestInFileClassFeature.NestInFileClassB*\u0088\u0001\u0001\u0098\u0001\u0003\u0098\u0001\u0006\u0098\u0001\u0008\u00a2\u0001\u000b\u0012\u0006LEGACY\u0018\u0084\u0007\u00a2\u0001\u0007\u0012\u0002NO\u0018\u00e9\u0007\u00b2\u0001\u0003\u0008\u00e9\u0007R\u000fnestInFileClass\u001a|\n\u0016NestInFileClassFeature\"X\n\u000fNestInFileClass\u0012\u001e\n\u001aNEST_IN_FILE_CLASS_UNKNOWN\u0010\u0000\u0012\u0006\n\u0002NO\u0010\u0001\u0012\u0007\n\u0003YES\u0010\u0002\u0012\u0014\n\u0006LEGACY\u0010\u0003\u001a\u0008\"\u0006\u0008\u00e9\u0007 \u00e9\u0007J\u0008\u0008\u0001\u0010\u0080\u0080\u0080\u0080\u0002\"F\n\u000eUtf8Validation\u0012\u001b\n\u0017UTF8_VALIDATION_UNKNOWN\u0010\u0000\u0012\u000b\n\u0007DEFAULT\u0010\u0001\u0012\n\n\u0006VERIFY\u0010\u0002J\u0004\u0008\u0006\u0010\u0007:B\n\u0004java\u0012\u001b.google.protobuf.FeatureSet\u0018\u00e9\u0007 \u0001(\u000b2\u0010.pb.JavaFeaturesR\u0004javaB(\n\u0013com.google.protobufB\u0011JavaFeaturesProto"

    .line 21
    .line 22
    filled-new-array {v1}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sget-object v2, Lcom/google/protobuf/飘花落叶言楪子苏兰世哲;->飘花落叶言子苏兰世楪哲:Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 27
    .line 28
    filled-new-array {v2}, [Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v1, v2}, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲苏兰世([Ljava/lang/String;[Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;)Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v2, v1, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰苏世:[Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    aget-object v2, v2, v3

    .line 40
    .line 41
    sput-object v2, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 42
    .line 43
    new-instance v4, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 44
    .line 45
    const-string v5, "UseOldOuterClassnameDefault"

    .line 46
    .line 47
    const-string v6, "NestInFileClass"

    .line 48
    .line 49
    const-string v7, "LegacyClosedEnum"

    .line 50
    .line 51
    const-string v8, "Utf8Validation"

    .line 52
    .line 53
    const-string v9, "LargeEnum"

    .line 54
    .line 55
    filled-new-array {v7, v8, v9, v5, v6}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-direct {v4, v2, v5}, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;-><init>(Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;[Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sput-object v4, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 63
    .line 64
    iget-object v2, v2, Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;->飘花落叶言子楪兰苏世哲:[Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 65
    .line 66
    aget-object v2, v2, v3

    .line 67
    .line 68
    sput-object v2, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;

    .line 69
    .line 70
    new-instance v4, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 71
    .line 72
    new-array v5, v3, [Ljava/lang/String;

    .line 73
    .line 74
    invoke-direct {v4, v2, v5}, Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;-><init>(Lcom/google/protobuf/飘花落叶言楪子哲世苏兰;[Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    sput-object v4, Lcom/google/protobuf/飘花落叶言世子兰哲楪苏;->飘花落叶言子楪世兰苏哲:Lcom/google/protobuf/飘花落叶言楪兰子苏哲世;

    .line 78
    .line 79
    iget-object v2, v1, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪兰苏世哲:[Lcom/google/protobuf/飘花落叶言楪子兰世苏哲;

    .line 80
    .line 81
    aget-object v2, v2, v3

    .line 82
    .line 83
    iget-object v3, v0, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪哲苏子世兰;

    .line 84
    .line 85
    if-nez v3, :cond_0

    .line 86
    .line 87
    new-instance v3, Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;

    .line 88
    .line 89
    invoke-direct {v3, v2}, Lcom/google/protobuf/飘花落叶言世楪苏兰子哲;-><init>(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iput-object v3, v0, Lcom/google/protobuf/飘花落叶言楪兰子哲世苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言楪哲苏子世兰;

    .line 93
    .line 94
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言楪子兰世哲苏;->飘花落叶言子楪哲兰世苏()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_0
    const-string v0, "Already initialized."

    .line 99
    .line 100
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method
