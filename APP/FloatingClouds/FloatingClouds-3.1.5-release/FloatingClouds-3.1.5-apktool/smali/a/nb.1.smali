.class public final La/nb;
.super La/u9;
.source "SourceFile"

# interfaces
.implements La/s7;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic d:La/lb;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;La/lb;II)V
    .locals 0

    iput p4, p0, La/nb;->b:I

    iput-object p1, p0, La/nb;->c:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, La/nb;->d:La/lb;

    iput p3, p0, La/nb;->e:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/u9;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, La/nb;->c:Lorg/luckypray/dexkit/DexKitBridge;

    iget v4, p0, La/nb;->e:I

    iget-object v5, p0, La/nb;->d:La/lb;

    iget v6, p0, La/nb;->b:I

    packed-switch v6, :pswitch_data_0

    iget v5, v5, La/lb;->e:I

    invoke-static {v4, v5}, La/X1;->a(II)J

    move-result-wide v4

    new-array v2, v2, [J

    aput-wide v4, v2, v1

    invoke-virtual {v3, v2}, Lorg/luckypray/dexkit/DexKitBridge;->r([J)La/d3;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, La/Y1;->a()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    check-cast v0, La/b3;

    return-object v0

    :pswitch_0
    iget-object v0, v5, La/lb;->f:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v4, v2}, La/X1;->a(II)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v1}, La/t3;->x0(Ljava/util/ArrayList;)[J

    move-result-object v0

    invoke-virtual {v3, v0}, Lorg/luckypray/dexkit/DexKitBridge;->r([J)La/d3;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget v5, v5, La/lb;->b:I

    invoke-static {v4, v5}, La/X1;->a(II)J

    move-result-wide v4

    new-array v2, v2, [J

    aput-wide v4, v2, v1

    invoke-virtual {v3, v2}, Lorg/luckypray/dexkit/DexKitBridge;->r([J)La/d3;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, La/Y1;->a()Ljava/lang/Object;

    move-result-object v0

    :goto_2
    check-cast v0, La/b3;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
