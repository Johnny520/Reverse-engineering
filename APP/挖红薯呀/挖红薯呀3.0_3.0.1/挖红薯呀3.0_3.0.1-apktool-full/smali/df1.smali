.class public final synthetic Ldf1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:F

.field public final synthetic f:Landroid/app/AlertDialog;


# direct methods
.method public synthetic constructor <init>(IFLandroid/app/AlertDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ldf1;->d:I

    .line 5
    .line 6
    iput p2, p0, Ldf1;->e:F

    .line 7
    .line 8
    iput-object p3, p0, Ldf1;->f:Landroid/app/AlertDialog;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Ldf1;->e:F

    .line 2
    .line 3
    iget-object v1, p0, Ldf1;->f:Landroid/app/AlertDialog;

    .line 4
    .line 5
    iget p0, p0, Ldf1;->d:I

    .line 6
    .line 7
    invoke-static {p0, v0, v1}, Lkf1;->v(IFLandroid/app/AlertDialog;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
