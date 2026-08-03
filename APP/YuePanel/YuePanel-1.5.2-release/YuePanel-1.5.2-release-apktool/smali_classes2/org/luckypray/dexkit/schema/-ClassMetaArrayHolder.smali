.class public final Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;
.super Lcom/google/flatbuffers/Table;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000f\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;",
        "Lcom/google/flatbuffers/Table;",
        "<init>",
        "()V",
        "",
        "_i",
        "Ljava/nio/ByteBuffer;",
        "_bb",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        "__init",
        "(ILjava/nio/ByteBuffer;)V",
        "__assign",
        "(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;",
        "j",
        "Lorg/luckypray/dexkit/schema/-ClassMeta;",
        "classes",
        "(I)Lorg/luckypray/dexkit/schema/-ClassMeta;",
        "obj",
        "(Lorg/luckypray/dexkit/schema/-ClassMeta;I)Lorg/luckypray/dexkit/schema/-ClassMeta;",
        "getClassesLength",
        "()I",
        "classesLength",
        "Companion",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->Companion:Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/flatbuffers/Table;-><init>()V

    return-void
.end method


# virtual methods
.method public final __assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;
    .locals 1
    .param p2    # Ljava/nio/ByteBuffer;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "_bb"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->__init(ILjava/nio/ByteBuffer;)V

    return-object p0
.end method

.method public final __init(ILjava/nio/ByteBuffer;)V
    .locals 1
    .param p2    # Ljava/nio/ByteBuffer;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "_bb"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lcom/google/flatbuffers/Table;->__reset(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public final classes(I)Lorg/luckypray/dexkit/schema/-ClassMeta;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/schema/-ClassMeta;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;-><init>()V

    invoke-virtual {p0, v0, p1}, Lorg/luckypray/dexkit/schema/-ClassMetaArrayHolder;->classes(Lorg/luckypray/dexkit/schema/-ClassMeta;I)Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-result-object p1

    return-object p1
.end method

.method public final classes(Lorg/luckypray/dexkit/schema/-ClassMeta;I)Lorg/luckypray/dexkit/schema/-ClassMeta;
    .locals 2
    .param p1    # Lorg/luckypray/dexkit/schema/-ClassMeta;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "obj"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/Table;->__vector(I)I

    move-result v1

    mul-int/2addr p2, v0

    add-int/2addr v1, p2

    invoke-virtual {p0, v1}, Lcom/google/flatbuffers/Table;->__indirect(I)I

    move-result p2

    iget-object v0, p0, Lcom/google/flatbuffers/Table;->bb:Ljava/nio/ByteBuffer;

    const-string v1, "bb"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, v0}, Lorg/luckypray/dexkit/schema/-ClassMeta;->__assign(ILjava/nio/ByteBuffer;)Lorg/luckypray/dexkit/schema/-ClassMeta;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final getClassesLength()I
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__offset(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/flatbuffers/Table;->__vector_len(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
