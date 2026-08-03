.class public abstract Lorg/luckypray/dexkit/query/base/BaseQuery;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IQuery;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/b;)I
    .locals 0

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->innerBuild(Lcom/google/flatbuffers/b;)I

    move-result p0

    return p0
.end method

.method private final build$dexkit_android_release(Lcom/google/flatbuffers/b;)I
    .locals 1

    const-string v0, "fbb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/b;)I

    move-result p1

    return p1
.end method


# virtual methods
.method public abstract innerBuild(Lcom/google/flatbuffers/b;)I
.end method
