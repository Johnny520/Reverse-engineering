.class public final LA9;
.super LBn;
.source ""

# interfaces
.implements LUi;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:LC9;

.field public final synthetic d:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic e:I


# direct methods
.method public constructor <init>(LC9;Lorg/luckypray/dexkit/DexKitBridge;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LA9;->b:I

    .line 1
    iput-object p1, p0, LA9;->c:LC9;

    iput-object p2, p0, LA9;->d:Lorg/luckypray/dexkit/DexKitBridge;

    iput p3, p0, LA9;->e:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LBn;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;LC9;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA9;->b:I

    .line 2
    iput-object p1, p0, LA9;->d:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, LA9;->c:LC9;

    iput p3, p0, LA9;->e:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LBn;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 9

    iget v0, p0, LA9;->b:I

    const/4 v1, 0x4

    iget v2, p0, LA9;->e:I

    iget-object v3, p0, LA9;->d:Lorg/luckypray/dexkit/DexKitBridge;

    iget-object v4, p0, LA9;->c:LC9;

    const/4 v5, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, v4, LC9;->d:Ljava/lang/Integer;

    const/4 v4, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v2, v0}, Lv5;->b(II)J

    move-result-wide v6

    const/4 v0, 0x1

    new-array v0, v0, [J

    aput-wide v6, v0, v5

    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->d(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v6

    invoke-static {v6, v7, v0}, Lorg/luckypray/dexkit/DexKitBridge;->f(J[J)[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    new-instance v2, La;

    invoke-direct {v2}, La;-><init>()V

    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v6

    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v6

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v7

    add-int/2addr v7, v6

    invoke-virtual {v2, v7, v0}, La;->c(ILjava/nio/ByteBuffer;)V

    new-instance v0, LD9;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v1}, La;->b(I)I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v2, v1}, La;->f(I)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v5

    :goto_0
    move v6, v5

    :goto_1
    if-ge v6, v1, :cond_1

    invoke-virtual {v2, v6}, La;->g(I)La;

    move-result-object v7

    invoke-static {v3, v7}, LfG;->R(Lorg/luckypray/dexkit/DexKitBridge;La;)LC9;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0, v5}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v4

    :goto_2
    check-cast v4, LC9;

    goto :goto_3

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "list is empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_3
    return-object v4

    :pswitch_0
    iget-object v0, v4, LC9;->e:Ljava/util/ArrayList;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-static {v2, v6}, Lv5;->b(II)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [J

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v4, v5

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    add-int/lit8 v8, v4, 0x1

    aput-wide v6, v0, v4

    move v4, v8

    goto :goto_5

    :cond_6
    invoke-static {v3}, Lorg/luckypray/dexkit/DexKitBridge;->d(Lorg/luckypray/dexkit/DexKitBridge;)J

    move-result-wide v6

    invoke-static {v6, v7, v0}, Lorg/luckypray/dexkit/DexKitBridge;->f(J[J)[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    new-instance v2, La;

    invoke-direct {v2}, La;-><init>()V

    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v4

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v6

    add-int/2addr v6, v4

    invoke-virtual {v2, v6, v0}, La;->c(ILjava/nio/ByteBuffer;)V

    new-instance v0, LD9;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v1}, La;->b(I)I

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v2, v1}, La;->f(I)I

    move-result v1

    goto :goto_6

    :cond_7
    move v1, v5

    :goto_6
    if-ge v5, v1, :cond_8

    invoke-virtual {v2, v5}, La;->g(I)La;

    move-result-object v4

    invoke-static {v3, v4}, LfG;->R(Lorg/luckypray/dexkit/DexKitBridge;La;)LC9;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_8
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
