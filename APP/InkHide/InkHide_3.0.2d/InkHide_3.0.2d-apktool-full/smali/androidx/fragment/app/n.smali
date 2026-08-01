.class public final Landroidx/fragment/app/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Le/i;


# direct methods
.method public synthetic constructor <init>(Le/i;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/fragment/app/n;->a:I

    iput-object p1, p0, Landroidx/fragment/app/n;->b:Le/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/fragment/app/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/fragment/app/n;->b:Le/i;

    .line 7
    .line 8
    invoke-virtual {v0}, Le/i;->i()Le/k;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Le/k;->a()V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Landroidx/activity/g;->f:LM/e;

    .line 16
    .line 17
    iget-object v0, v0, LM/e;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, LM/d;

    .line 20
    .line 21
    const-string v2, "androidx:appcompat"

    .line 22
    .line 23
    invoke-virtual {v0, v2}, LM/d;->c(Ljava/lang/String;)Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Le/k;->c()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    iget-object v0, p0, Landroidx/fragment/app/n;->b:Le/i;

    .line 31
    .line 32
    iget-object v1, v0, Le/i;->p:LC/j;

    .line 33
    .line 34
    iget-object v2, v1, LC/j;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Landroidx/fragment/app/o;

    .line 37
    .line 38
    iget-object v3, v2, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-virtual {v3, v2, v2, v4}, Landroidx/fragment/app/z;->b(Landroidx/fragment/app/o;LD/h;Landroidx/fragment/app/l;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, v0, Landroidx/activity/g;->f:LM/e;

    .line 45
    .line 46
    iget-object v0, v0, LM/e;->d:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, LM/d;

    .line 49
    .line 50
    const-string v2, "android:support:fragments"

    .line 51
    .line 52
    invoke-virtual {v0, v2}, LM/d;->c(Ljava/lang/String;)Landroid/os/Bundle;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v1, v1, LC/j;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Landroidx/fragment/app/o;

    .line 65
    .line 66
    iget-object v1, v1, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 67
    .line 68
    invoke-virtual {v1, v0}, Landroidx/fragment/app/z;->N(Landroid/os/Parcelable;)V

    .line 69
    .line 70
    .line 71
    :cond_0
    return-void

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
