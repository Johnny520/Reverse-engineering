.class public final synthetic La/n5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    iput p2, p0, La/n5;->a:I

    iput-object p1, p0, La/n5;->b:Ljava/lang/Object;

    iput-object p3, p0, La/n5;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 10

    iget v0, p0, La/n5;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/n5;->b:Ljava/lang/Object;

    check-cast v0, La/Sc;

    iget-object v0, v0, La/Sc;->a:Ljava/lang/Object;

    check-cast v0, Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    iget-object v0, p0, La/n5;->c:Ljava/lang/Object;

    check-cast v0, La/ra;

    invoke-virtual {v0}, La/ra;->f()V

    sget-object v0, La/Wf;->a:La/Wf;

    return-object v0

    :pswitch_0
    new-instance v0, La/y6;

    invoke-direct {v0}, La/y6;-><init>()V

    new-instance v1, La/e3;

    invoke-direct {v1}, La/e3;-><init>()V

    iget-object v2, p0, La/n5;->c:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/String;

    array-length v3, v2

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    const-string v3, "usingStrings"

    invoke-static {v2, v3}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    array-length v4, v2

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    array-length v4, v2

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v4, :cond_1

    aget-object v7, v2, v6

    new-instance v8, La/ve;

    const/4 v9, 0x1

    invoke-direct {v8, v7, v9, v5}, La/ve;-><init>(Ljava/lang/String;IZ)V

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v3}, La/t3;->y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, v1, La/e3;->c:Ljava/util/List;

    iput-object v1, v0, La/y6;->b:La/e3;

    iget-object v1, p0, La/n5;->b:Ljava/lang/Object;

    check-cast v1, Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->p(La/y6;)La/d3;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
