.class public final synthetic La/p5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s7;


# instance fields
.field public final synthetic a:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/p5;->a:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, La/p5;->b:Ljava/lang/String;

    iput-object p3, p0, La/p5;->c:Ljava/lang/String;

    iput-object p4, p0, La/p5;->d:Ljava/util/List;

    iput-object p5, p0, La/p5;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    new-instance v0, La/z6;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, La/z6;-><init>(I)V

    new-instance v1, La/pb;

    invoke-direct {v1}, La/pb;-><init>()V

    iget-object v2, p0, La/p5;->b:Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-static {v1, v2}, La/pb;->h(La/pb;Ljava/lang/String;)V

    :cond_0
    iget-object v2, p0, La/p5;->c:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-static {v1, v2}, La/pb;->j(La/pb;Ljava/lang/String;)V

    :cond_1
    iget-object v2, p0, La/p5;->d:Ljava/util/List;

    if-eqz v2, :cond_2

    invoke-virtual {v1, v2}, La/pb;->i(Ljava/util/Collection;)V

    :cond_2
    iget-object v2, p0, La/p5;->e:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-static {v1, v2}, La/pb;->g(La/pb;Ljava/lang/String;)V

    :cond_3
    iput-object v1, v0, La/z6;->b:La/a2;

    iget-object v1, p0, La/p5;->a:Lorg/luckypray/dexkit/DexKitBridge;

    invoke-virtual {v1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->q(La/z6;)La/ob;

    move-result-object v0

    return-object v0
.end method
