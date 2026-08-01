.class public final synthetic Ltd1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic α:Landroid/app/Activity;

.field public final synthetic β:Landroid/app/AlertDialog;

.field public final synthetic γ:Lum1;

.field public final synthetic δ:Landroid/widget/TextView;

.field public final synthetic ε:Landroid/widget/TextView;

.field public final synthetic ζ:Ljava/util/LinkedHashMap;

.field public final synthetic η:Lqm1;

.field public final synthetic θ:Landroid/widget/RadioGroup;

.field public final synthetic ι:Lum1;

.field public final synthetic κ:I

.field public final synthetic λ:Ljava/lang/Integer;

.field public final synthetic μ:Ljava/lang/Long;

.field public final synthetic ν:Z

.field public final synthetic ξ:Z

.field public final synthetic ο:Landroid/widget/TextView;

.field public final synthetic π:Landroid/view/LayoutInflater;

.field public final synthetic ρ:Lxx;


# direct methods
.method public synthetic constructor <init>(ILxx;Lqm1;Lum1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/view/LayoutInflater;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/LinkedHashMap;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p6, p0, Ltd1;->α:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p7, p0, Ltd1;->β:Landroid/app/AlertDialog;

    .line 7
    .line 8
    iput-object p4, p0, Ltd1;->γ:Lum1;

    .line 9
    .line 10
    iput-object p10, p0, Ltd1;->δ:Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object p11, p0, Ltd1;->ε:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p15, p0, Ltd1;->ζ:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    iput-object p3, p0, Ltd1;->η:Lqm1;

    .line 17
    .line 18
    iput-object p9, p0, Ltd1;->θ:Landroid/widget/RadioGroup;

    .line 19
    .line 20
    iput-object p5, p0, Ltd1;->ι:Lum1;

    .line 21
    .line 22
    iput p1, p0, Ltd1;->κ:I

    .line 23
    .line 24
    iput-object p13, p0, Ltd1;->λ:Ljava/lang/Integer;

    .line 25
    .line 26
    iput-object p14, p0, Ltd1;->μ:Ljava/lang/Long;

    .line 27
    .line 28
    move/from16 p1, p16

    .line 29
    .line 30
    iput-boolean p1, p0, Ltd1;->ν:Z

    .line 31
    .line 32
    move/from16 p1, p17

    .line 33
    .line 34
    iput-boolean p1, p0, Ltd1;->ξ:Z

    .line 35
    .line 36
    iput-object p12, p0, Ltd1;->ο:Landroid/widget/TextView;

    .line 37
    .line 38
    iput-object p8, p0, Ltd1;->π:Landroid/view/LayoutInflater;

    .line 39
    .line 40
    iput-object p2, p0, Ltd1;->ρ:Lxx;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lxd1;->α:Ljava/util/concurrent/ExecutorService;

    .line 4
    .line 5
    iget-object v8, v0, Ltd1;->β:Landroid/app/AlertDialog;

    .line 6
    .line 7
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v7, v0, Ltd1;->α:Landroid/app/Activity;

    .line 11
    .line 12
    invoke-static {v7, v8}, Lxd1;->γ(Landroid/app/Activity;Landroid/app/AlertDialog;)V

    .line 13
    .line 14
    .line 15
    iget-object v5, v0, Ltd1;->γ:Lum1;

    .line 16
    .line 17
    iget-object v1, v5, Lum1;->ε:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/16 v19, 0x0

    .line 28
    .line 29
    iget v2, v0, Ltd1;->κ:I

    .line 30
    .line 31
    iget-object v3, v0, Ltd1;->ρ:Lxx;

    .line 32
    .line 33
    iget-object v4, v0, Ltd1;->η:Lqm1;

    .line 34
    .line 35
    iget-object v6, v0, Ltd1;->ι:Lum1;

    .line 36
    .line 37
    iget-object v9, v0, Ltd1;->π:Landroid/view/LayoutInflater;

    .line 38
    .line 39
    iget-object v10, v0, Ltd1;->θ:Landroid/widget/RadioGroup;

    .line 40
    .line 41
    iget-object v11, v0, Ltd1;->δ:Landroid/widget/TextView;

    .line 42
    .line 43
    iget-object v12, v0, Ltd1;->ε:Landroid/widget/TextView;

    .line 44
    .line 45
    iget-object v13, v0, Ltd1;->ο:Landroid/widget/TextView;

    .line 46
    .line 47
    iget-object v14, v0, Ltd1;->λ:Ljava/lang/Integer;

    .line 48
    .line 49
    iget-object v15, v0, Ltd1;->μ:Ljava/lang/Long;

    .line 50
    .line 51
    iget-object v1, v0, Ltd1;->ζ:Ljava/util/LinkedHashMap;

    .line 52
    .line 53
    move-object/from16 v16, v1

    .line 54
    .line 55
    iget-boolean v1, v0, Ltd1;->ν:Z

    .line 56
    .line 57
    iget-boolean v0, v0, Ltd1;->ξ:Z

    .line 58
    .line 59
    move/from16 v18, v0

    .line 60
    .line 61
    move/from16 v17, v1

    .line 62
    .line 63
    invoke-static/range {v2 .. v19}, Lxd1;->ξ(ILxx;Lqm1;Lum1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/view/LayoutInflater;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/LinkedHashMap;ZZZ)V

    .line 64
    .line 65
    .line 66
    :cond_0
    return-void
.end method
