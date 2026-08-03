.class public final synthetic Lb0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/l;


# instance fields
.field public final synthetic a:Ljava/lang/ClassLoader;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lf0/b;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lf0/b;Ljava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lb0/d;->a:Ljava/lang/ClassLoader;

    iput-object p1, p0, Lb0/d;->b:Landroid/content/Context;

    iput-object p4, p0, Lb0/d;->c:Ljava/lang/String;

    iput-object p2, p0, Lb0/d;->d:Lf0/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    iget-object v0, p0, Lb0/d;->a:Ljava/lang/ClassLoader;

    const-string v1, "$classLoader"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lb0/d;->b:Landroid/content/Context;

    const-string v2, "$context"

    invoke-static {v1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "bridge"

    invoke-static {p1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lb0/l;

    iget-object v3, p0, Lb0/d;->c:Ljava/lang/String;

    invoke-direct {v2, v0, p1, v1, v3}, Lb0/l;-><init>(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Landroid/content/Context;Ljava/lang/String;)V

    iget-object p1, p0, Lb0/d;->d:Lf0/b;

    invoke-static {v2, p1}, LU/S;->f0(Lb0/l;Lf0/b;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method
