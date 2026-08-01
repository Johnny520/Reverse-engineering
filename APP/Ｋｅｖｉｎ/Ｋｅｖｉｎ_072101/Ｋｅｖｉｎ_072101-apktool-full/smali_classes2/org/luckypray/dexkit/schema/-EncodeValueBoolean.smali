.class public final Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;
.super Lcom/google/flatbuffers/Table;
.source "EncodeValueBoolean.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-EncodeValueBoolean$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0010"
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;",
        "Lcom/google/flatbuffers/Table;",
        "()V",
        "value",
        "",
        "getValue",
        "()Z",
        "__assign",
        "_i",
        "",
        "_bb",
        "Ljava/nio/ByteBuffer;",
        "__init",
        "",
        "mutateValue",
        "Companion",
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


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/schema/-EncodeValueBoolean$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->Companion:Lorg/luckypray/dexkit/schema/-EncodeValueBoolean$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/google/flatbuffers/Table;-><init>()V

    return-void
.end method


# virtual methods
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;
    .locals 1
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->__init(ILjava/nio/ByteBuffer;)V

    .line 29
    return-object p0
.end method

.method public final __init(ILjava/nio/ByteBuffer;)V
    .locals 1
    .param p1, "_i"    # I
    .param p2, "_bb"    # Ljava/nio/ByteBuffer;

    const-string v0, "_bb"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->__reset(ILjava/nio/ByteBuffer;)V

    .line 26
    return-void
.end method

.method public final getValue()Z
    .locals 5

    .line 33
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->__offset(I)I

    move-result v0

    .line 34
    .local v0, "o":I
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    int-to-byte v2, v1

    iget-object v3, p0, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->bb:Ljava/nio/ByteBuffer;

    iget v4, p0, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->bb_pos:I

    add-int/2addr v4, v0

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    if-eq v2, v3, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final mutateValue(Z)Z
    .locals 4
    .param p1, "value"    # Z

    .line 37
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->__offset(I)I

    move-result v0

    .line 38
    .local v0, "o":I
    if-eqz v0, :cond_0

    .line 39
    iget-object v1, p0, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->bb:Ljava/nio/ByteBuffer;

    iget v2, p0, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->bb_pos:I

    add-int/2addr v2, v0

    int-to-byte v3, p1

    invoke-virtual {v1, v2, v3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 40
    const/4 v1, 0x1

    goto :goto_0

    .line 42
    :cond_0
    const/4 v1, 0x0

    .line 38
    :goto_0
    return v1
.end method
