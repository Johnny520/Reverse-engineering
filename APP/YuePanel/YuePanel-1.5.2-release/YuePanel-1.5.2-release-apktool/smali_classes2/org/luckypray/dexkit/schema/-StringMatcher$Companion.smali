.class public final Lorg/luckypray/dexkit/schema/-StringMatcher$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/schema/-StringMatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\u000cJ-\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-StringMatcher$Companion;",
        "",
        "<init>",
        "()V",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        "validateVersion",
        "Ljava/nio/ByteBuffer;",
        "_bb",
        "Lorg/luckypray/dexkit/schema/-StringMatcher;",
        "getRootAsStringMatcher",
        "(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-StringMatcher;",
        "obj",
        "(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "builder",
        "",
        "valueOffset",
        "",
        "matchType",
        "",
        "ignoreCase",
        "createStringMatcher",
        "(Lcom/google/flatbuffers/FlatBufferBuilder;IBZ)I",
        "startStringMatcher",
        "(Lcom/google/flatbuffers/FlatBufferBuilder;)V",
        "value",
        "addValue",
        "(Lcom/google/flatbuffers/FlatBufferBuilder;I)V",
        "addMatchType",
        "(Lcom/google/flatbuffers/FlatBufferBuilder;B)V",
        "addIgnoreCase",
        "(Lcom/google/flatbuffers/FlatBufferBuilder;Z)V",
        "endStringMatcher",
        "(Lcom/google/flatbuffers/FlatBufferBuilder;)I",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
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
    invoke-direct {p0}, Lorg/luckypray/dexkit/schema/-StringMatcher$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final addIgnoreCase(Lcom/google/flatbuffers/FlatBufferBuilder;Z)V
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addBoolean(IZZ)V

    return-void
.end method

.method public final addMatchType(Lcom/google/flatbuffers/FlatBufferBuilder;B)V
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/flatbuffers/FlatBufferBuilder;->addByte(IBI)V

    return-void
.end method

.method public final addValue(Lcom/google/flatbuffers/FlatBufferBuilder;I)V
    .locals 1
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->addOffset(III)V

    return-void
.end method

.method public final createStringMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;IBZ)I
    .locals 1
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-StringMatcher$Companion;->addValue(Lcom/google/flatbuffers/FlatBufferBuilder;I)V

    invoke-virtual {p0, p1, p4}, Lorg/luckypray/dexkit/schema/-StringMatcher$Companion;->addIgnoreCase(Lcom/google/flatbuffers/FlatBufferBuilder;Z)V

    invoke-virtual {p0, p1, p3}, Lorg/luckypray/dexkit/schema/-StringMatcher$Companion;->addMatchType(Lcom/google/flatbuffers/FlatBufferBuilder;B)V

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/schema/-StringMatcher$Companion;->endStringMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result p1

    return p1
.end method

.method public final endStringMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 1
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/flatbuffers/FlatBufferBuilder;->endTable()I

    move-result p1

    return p1
.end method

.method public final getRootAsStringMatcher(Ljava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-StringMatcher;
    .locals 1
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "_bb"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-StringMatcher;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-StringMatcher;-><init>()V

    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/schema/-StringMatcher$Companion;->getRootAsStringMatcher(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final getRootAsStringMatcher(Ljava/nio/ByteBuffer;Lorg/luckypray/dexkit/schema/-StringMatcher;)Lorg/luckypray/dexkit/schema/-StringMatcher;
    .locals 2
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/schema/-StringMatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "_bb"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "obj"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 3
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p2, v0, p1}, Lorg/luckypray/dexkit/schema/-StringMatcher;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-StringMatcher;

    move-result-object p1

    return-object p1
.end method

.method public final startStringMatcher(Lcom/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "builder"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->startTable(I)V

    return-void
.end method

.method public final validateVersion()V
    .locals 0

    invoke-static {}, Lcom/google/flatbuffers/Constants;->FLATBUFFERS_23_5_26()V

    return-void
.end method
