.class public final Lt2;
.super Ljava/lang/Object;

# interfaces
.implements Lyw;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/fragment/app/FragmentActivity;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lt2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lt2;->b:Landroidx/fragment/app/FragmentActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget v0, p0, Lt2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt2;->b:Landroidx/fragment/app/FragmentActivity;

    .line 7
    .line 8
    iget-object v1, v0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 9
    .line 10
    iget-object v2, v1, Ll0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lnl;

    .line 13
    .line 14
    iget-object v3, v2, Lnl;->F:Lyl;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-virtual {v3, v2, v2, v4}, Lyl;->b(Lnl;Lip;Lml;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->e:Lgm;

    .line 21
    .line 22
    iget-object v0, v0, Lgm;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, La3;

    .line 25
    .line 26
    const-string v2, "android:support:fragments"

    .line 27
    .line 28
    invoke-virtual {v0, v2}, La3;->c(Ljava/lang/String;)Landroid/os/Bundle;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, v1, Ll0;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lnl;

    .line 41
    .line 42
    iget-object v1, v1, Lnl;->F:Lyl;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Lyl;->K(Landroid/os/Parcelable;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void

    .line 48
    :pswitch_0
    iget-object v0, p0, Lt2;->b:Landroidx/fragment/app/FragmentActivity;

    .line 49
    .line 50
    check-cast v0, Landroidx/appcompat/app/AppCompatActivity;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->l()Le3;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Le3;->a()V

    .line 57
    .line 58
    .line 59
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->e:Lgm;

    .line 60
    .line 61
    iget-object v0, v0, Lgm;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, La3;

    .line 64
    .line 65
    const-string v2, "androidx:appcompat"

    .line 66
    .line 67
    invoke-virtual {v0, v2}, La3;->c(Ljava/lang/String;)Landroid/os/Bundle;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Le3;->d()V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
