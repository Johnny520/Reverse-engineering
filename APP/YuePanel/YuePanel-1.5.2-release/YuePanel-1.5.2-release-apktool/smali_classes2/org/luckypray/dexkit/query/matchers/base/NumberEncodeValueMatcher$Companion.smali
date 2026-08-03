.class public final Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0008H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000cH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;",
        "",
        "()V",
        "create",
        "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;",
        "value",
        "",
        "createByte",
        "",
        "createDouble",
        "",
        "createFloat",
        "",
        "createInt",
        "",
        "createLong",
        "",
        "createShort",
        "",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create()Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;-><init>()V

    return-object v0
.end method

.method public final create(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1
    .param p1    # Ljava/lang/Number;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;-><init>()V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final createByte(B)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;-><init>()V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->byteValue(B)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final createDouble(D)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;-><init>()V

    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->doubleValue(D)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final createFloat(F)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;-><init>()V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->floatValue(F)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final createInt(I)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;-><init>()V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->intValue(I)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final createLong(J)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;-><init>()V

    invoke-virtual {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->longValue(J)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final createShort(S)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;-><init>()V

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->shortValue(S)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object p1

    return-object p1
.end method
