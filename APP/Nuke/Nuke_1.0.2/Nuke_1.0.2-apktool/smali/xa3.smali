.class public final Lxa3;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic i:Lo2;

.field public final synthetic j:Lb9;

.field public final synthetic k:Lum2;


# direct methods
.method public constructor <init>(Lo2;Lb9;Lum2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxa3;->i:Lo2;

    .line 2
    .line 3
    iput-object p2, p0, Lxa3;->j:Lb9;

    .line 4
    .line 5
    iput-object p3, p0, Lxa3;->k:Lum2;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lxa3;->j:Lb9;

    .line 2
    .line 3
    iget-object v1, p0, Lxa3;->i:Lo2;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Lt11;->y(Landroid/view/View;)Lz12;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Lz12;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object p0, p0, Lxa3;->k:Lum2;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    sget-object p0, La83;->a:La83;

    .line 20
    .line 21
    return-object p0
.end method
