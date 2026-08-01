.class public final synthetic Lw71;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:Landroid/view/View;

.field public final synthetic e:Llf;

.field public final synthetic f:Z


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Llf;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw71;->d:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Lw71;->e:Llf;

    .line 7
    .line 8
    iput-boolean p3, p0, Lw71;->f:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lw71;->e:Llf;

    .line 2
    .line 3
    iget-boolean v1, p0, Lw71;->f:Z

    .line 4
    .line 5
    iget-object p0, p0, Lw71;->d:Landroid/view/View;

    .line 6
    .line 7
    invoke-static {p0, v0, v1}, Lx71;->b(Landroid/view/View;Llf;Z)Lna1;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
