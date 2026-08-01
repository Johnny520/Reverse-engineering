.class public final synthetic Lu61;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/PopupMenu$OnMenuItemClickListener;


# instance fields
.field public final synthetic α:Lp70;

.field public final synthetic β:Lj71;

.field public final synthetic γ:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lp70;Lj71;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu61;->α:Lp70;

    .line 5
    .line 6
    iput-object p2, p0, Lu61;->β:Lj71;

    .line 7
    .line 8
    iput-object p3, p0, Lu61;->γ:Landroid/app/Activity;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    iget-object p1, p0, Lu61;->α:Lp70;

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p1}, Lp70;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    goto :goto_0

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    new-instance v0, Leo1;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :goto_0
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lu61;->β:Lj71;

    .line 22
    .line 23
    iget-object v0, v0, Lj71;->α:Ljava/lang/String;

    .line 24
    .line 25
    const-string v1, "\u64cd\u4f5c\u9762\u677f\u66f4\u591a\u64cd\u4f5c\u5931\u8d25: "

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "DYHelper"

    .line 32
    .line 33
    invoke-static {v1, v0, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    const-string p1, "\u64cd\u4f5c\u6267\u884c\u5931\u8d25"

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iget-object p0, p0, Lu61;->γ:Landroid/app/Activity;

    .line 40
    .line 41
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 46
    .line 47
    .line 48
    :cond_0
    const/4 p0, 0x1

    .line 49
    return p0
.end method
