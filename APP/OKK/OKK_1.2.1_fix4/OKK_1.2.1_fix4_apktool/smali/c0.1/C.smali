.class public final synthetic Lc0/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/ViewGroup;

.field public final synthetic c:Landroid/view/ViewGroup;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILandroid/view/ViewGroup;Landroid/view/ViewGroup;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc0/C;->a:I

    iput-object p2, p0, Lc0/C;->b:Landroid/view/ViewGroup;

    iput-object p3, p0, Lc0/C;->c:Landroid/view/ViewGroup;

    iput-object p4, p0, Lc0/C;->d:Ljava/lang/Object;

    iput-object p5, p0, Lc0/C;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    const-string v0, "$parent"

    iget-object v1, p0, Lc0/C;->b:Landroid/view/ViewGroup;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$mainTabUi"

    iget-object v2, p0, Lc0/C;->d:Ljava/lang/Object;

    invoke-static {v2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lc0/C;->a:I

    add-int/lit8 v0, v0, -0x1

    iget-object v3, p0, Lc0/C;->c:Landroid/view/ViewGroup;

    iget-object v4, p0, Lc0/C;->e:Ljava/lang/Object;

    invoke-static {v0, v1, v3, v2, v4}, Lc0/G;->v(ILandroid/view/ViewGroup;Landroid/view/ViewGroup;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
