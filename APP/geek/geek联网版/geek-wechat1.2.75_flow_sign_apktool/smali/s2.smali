.class public final Ls2;
.super Ljava/lang/Object;

# interfaces
.implements La20;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La3;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ls2;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ls2;->b:Ljava/lang/Object;

    .line 4
    const-string v0, "androidx.savedstate.Restarter"

    invoke-virtual {p1, v0, p0}, La3;->e(Ljava/lang/String;La20;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls2;->a:I

    iput-object p1, p0, Ls2;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 4

    .line 1
    iget v0, p0, Ls2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v2, p0, Ls2;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    const-string v2, "classes_to_restore"

    .line 21
    .line 22
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    new-instance v0, Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Ls2;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Landroidx/fragment/app/FragmentActivity;

    .line 34
    .line 35
    iget-object v2, v1, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 36
    .line 37
    :cond_0
    iget-object v3, v2, Ll0;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, Lpl;

    .line 40
    .line 41
    iget-object v3, v3, Lpl;->B:Lam;

    .line 42
    .line 43
    invoke-static {v3}, Landroidx/fragment/app/FragmentActivity;->k(Lam;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_0

    .line 48
    .line 49
    iget-object v1, v1, Landroidx/fragment/app/FragmentActivity;->t:Landroidx/lifecycle/a;

    .line 50
    .line 51
    sget-object v3, Lmq;->ON_STOP:Lmq;

    .line 52
    .line 53
    invoke-virtual {v1, v3}, Landroidx/lifecycle/a;->d(Lmq;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v2, Ll0;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Lpl;

    .line 59
    .line 60
    iget-object v1, v1, Lpl;->B:Lam;

    .line 61
    .line 62
    invoke-virtual {v1}, Lam;->L()Lbm;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    const-string v2, "android:support:fragments"

    .line 69
    .line 70
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    return-object v0

    .line 74
    :pswitch_1
    new-instance v0, Landroid/os/Bundle;

    .line 75
    .line 76
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Ls2;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Landroidx/appcompat/app/AppCompatActivity;

    .line 82
    .line 83
    invoke-virtual {v1}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
