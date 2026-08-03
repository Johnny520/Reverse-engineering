.class public final La/R8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/mmjz/floatingclouds/plugin/IPlugin;


# static fields
.field public static final c:[Ljava/lang/String;

.field public static final d:[Ljava/lang/String;

.field public static final e:[Ljava/lang/String;

.field public static final f:[Ljava/lang/String;

.field public static final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/regex/Pattern;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public volatile b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const-string v0, "username=(.*?),"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    const-string v0, "com.tencent.mm.plugin.voip.widget.VoipNewForegroundService"

    const-string v1, "com.tencent.mm.plugin.voip.widget.VoipSmallService"

    const-string v2, "com.tencent.mm.plugin.voip.widget.VoipForegroundService"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, La/R8;->c:[Ljava/lang/String;

    const-string v5, "com.tencent.mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog"

    const-string v6, "com.tencent.mm.plugin.voip.ui.VoipViewFragment"

    const-string v1, "com.tencent.mm.plugin.voip.ui.VideoActivity"

    const-string v2, "com.tencent.mm.plugin.appbrand.wmpfvoip.notify.ui.WmpfVoipCallInProxyActivity"

    const-string v3, "com.tencent.mm.plugin.voip.ui.MMSuperAlert"

    const-string v4, "com.tencent.mm.plugin.voip.widget.InviteRemindDialog"

    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, La/R8;->d:[Ljava/lang/String;

    const-string v10, "\u7b49\u5f85\u63a5\u542c"

    const-string v11, "\u63a5\u542c"

    const-string v1, "voip"

    const-string v2, "call"

    const-string v3, "incoming"

    const-string v4, "\u8bed\u97f3"

    const-string v5, "\u89c6\u9891"

    const-string v6, "\u901a\u8bdd"

    const-string v7, "\u547c\u53eb"

    const-string v8, "\u6765\u7535"

    const-string v9, "\u9080\u8bf7\u4f60"

    filled-new-array/range {v1 .. v11}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, La/R8;->e:[Ljava/lang/String;

    const-string v5, "com.tencent.mm.plugin.voip.video.VoIPRenderTextureView"

    const-string v6, "com.tencent.mm.plugin.voip.widget.VoipBigIconButton"

    const-string v1, "com.tencent.mm.plugin.voip.widget.NewVideoTalkingSmallView"

    const-string v2, "com.tencent.mm.plugin.voip.widget.BaseSmallView"

    const-string v3, "com.tencent.mm.plugin.voip.video.MovableVideoView"

    const-string v4, "com.tencent.mm.plugin.voip.video.NewMovableVideoView"

    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, La/R8;->f:[Ljava/lang/String;

    const-string v0, "(voip_)?(is_?)?out_?call[=:](true|1|yes)"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v2, "outgoing[=:](true|1|yes)"

    invoke-static {v2, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v2

    const-string v3, "is_?caller[=:](true|1|yes)"

    invoke-static {v3, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v3

    const-string v4, "(is_?)?from_?me[=:](true|1|yes)"

    invoke-static {v4, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v4

    filled-new-array {v0, v2, v3, v4}, [Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-static {v0}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    const-string v0, "(is_?)?incoming[=:](true|1|yes)"

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v2

    const-string v0, "(voip_)?in_?call[=:](true|1|yes)"

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v3

    const-string v0, "invite[=:](true|1|yes)"

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v4

    const-string v0, "caller[=:](false|0|no)"

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v5

    const-string v0, "(is_?)?from_?me[=:](false|0|no)"

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v6

    const-string v0, "is_?ilink_?voip[=:](true|1|yes)"

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v7

    filled-new-array/range {v2 .. v7}, [Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-static {v0}, La/o3;->d0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, La/R8;->g:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "com.tencent.mm.plugin.voip.ui.VideoActivity"

    const-string v1, "com.tencent.mm.plugin.appbrand.wmpfvoip.notify.ui.WmpfVoipCallInProxyActivity"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/n9;->z([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, La/R8;->a:Ljava/util/Set;

    return-void
.end method

.method public static a(Landroid/app/Notification;)Ljava/util/ArrayList;
    .locals 5

    iget-object v0, p0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    if-eqz v2, :cond_1

    const-string v3, "android.title"

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    iget-object v3, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    if-eqz v3, :cond_2

    const-string v4, "android.text"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v1

    :goto_2
    iget-object p0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    if-eqz p0, :cond_3

    const-string v4, "android.bigText"

    invoke-virtual {p0, v4}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_3
    filled-new-array {v0, v2, v3, v1}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/N1;->c0([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/view/View;)Ljava/util/ArrayList;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    invoke-static {p0, v0}, La/R8;->c(Landroid/view/View;Ljava/util/ArrayList;)V

    sget-object p0, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception p0

    invoke-static {p0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    return-object v0
.end method

.method public static c(Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 3

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, p1}, La/R8;->c(Landroid/view/View;Ljava/util/ArrayList;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "(wxid_[a-zA-Z0-9_-]+|gh_[a-zA-Z0-9]+|\\d+@chatroom|[a-zA-Z0-9_-]+@openim)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toLowerCase(...)"

    invoke-static {p0, v0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "qmessage"

    const-string v1, "filehelper"

    const-string v2, "weixin"

    filled-new-array {v1, v2, v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x3

    if-ge v2, v3, :cond_2

    aget-object v3, v0, v2

    invoke-static {p0, v3, v1}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-eqz v4, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static e(Landroid/content/Intent;)Ljava/lang/String;
    .locals 4

    const-string v0, "Voip_User"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "username"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "talker"

    invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "k_username"

    invoke-virtual {p0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {v0, v1, v2, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/N1;->c0([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, La/yh;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public static f(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 7

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    const-string v1, "getArgs(...)"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v0, v2

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/app/Notification;

    if-eqz v1, :cond_2

    check-cast v0, Landroid/app/Notification;

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    if-nez v0, :cond_3

    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-static {v0}, La/R8;->a(Landroid/app/Notification;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, La/R8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_5
    move-object v4, v2

    :goto_2
    if-eqz v4, :cond_6

    sget-object v3, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v4}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    const-string p0, "intercept notification for hidden user="

    invoke-virtual {p0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/R8;->r(Ljava/lang/String;)V

    return-object v2

    :cond_6
    sget-object v3, La/K3;->a:La/K3$a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v3

    iget-boolean v3, v3, La/jc;->D:Z

    if-nez v3, :cond_7

    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_7
    invoke-static {v0}, La/R8;->q(Landroid/app/Notification;)Z

    move-result v0

    invoke-static {}, La/bh;->b()Z

    move-result v3

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "NotificationManager.notify active="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, " isVoip="

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, " texts="

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " wxidInText="

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, La/R8;->r(Ljava/lang/String;)V

    invoke-static {}, La/bh;->b()Z

    move-result v1

    if-eqz v1, :cond_8

    if-eqz v0, :cond_8

    goto :goto_3

    :cond_8
    if-eqz v4, :cond_9

    sget-object v0, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v4}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string p0, "intercept notification containing blacklisted user="

    invoke-virtual {p0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/R8;->r(Ljava/lang/String;)V

    invoke-static {v4}, La/bh;->g(Ljava/lang/String;)V

    :goto_3
    const-string p0, "suppress VoIP notification"

    invoke-static {p0}, La/R8;->r(Ljava/lang/String;)V

    invoke-static {}, La/bh;->e()V

    return-object v2

    :cond_9
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 4

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget-boolean v0, v0, La/jc;->D:Z

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    const-string v1, "getArgs(...)"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Landroid/content/Intent;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_2
    move-object v1, v2

    :goto_0
    instance-of v0, v1, Landroid/content/Intent;

    if-eqz v0, :cond_3

    check-cast v1, Landroid/content/Intent;

    goto :goto_1

    :cond_3
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_4

    const-string v0, "startActivity"

    invoke-static {v0, v1}, La/R8;->s(Ljava/lang/String;Landroid/content/Intent;)V

    invoke-static {v1}, La/R8;->t(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object p0

    invoke-static {v1}, La/R8;->u(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "intercept startActivity intent="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " extras="

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/R8;->r(Ljava/lang/String;)V

    return-object v2

    :cond_4
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_5
    :goto_2
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 4

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget-boolean v0, v0, La/jc;->D:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v0

    const-string v1, "getArgs(...)"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Landroid/content/Intent;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_2
    move-object v1, v2

    :goto_0
    instance-of v0, v1, Landroid/content/Intent;

    if-eqz v0, :cond_3

    move-object v2, v1

    check-cast v2, Landroid/content/Intent;

    :cond_3
    if-eqz v2, :cond_4

    const-string v0, "startService/startForegroundService/bindService"

    invoke-static {v0, v2}, La/R8;->s(Ljava/lang/String;Landroid/content/Intent;)V

    invoke-static {v2}, La/R8;->t(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object p0

    invoke-static {v2}, La/R8;->u(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "intercept startService/startForegroundService/bindService intent="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " extras="

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/R8;->r(Ljava/lang/String;)V

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :cond_4
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_5
    :goto_1
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static j(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 13

    const/4 v0, 0x1

    sget-object v1, La/K3;->a:La/K3$a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v1

    iget-boolean v1, v1, La/jc;->D:Z

    if-nez v1, :cond_0

    goto/16 :goto_b

    :cond_0
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v1

    const-string v2, "getArgs(...)"

    invoke-static {v1, v2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-static {v1, v3}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, Landroid/view/View;

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    check-cast v1, Landroid/view/View;

    goto :goto_0

    :cond_1
    move-object v1, v5

    :goto_0
    if-nez v1, :cond_2

    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v4

    invoke-static {v4, v2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v0}, La/t3;->o0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Landroid/view/WindowManager$LayoutParams;

    if-eqz v4, :cond_3

    check-cast v2, Landroid/view/WindowManager$LayoutParams;

    goto :goto_1

    :cond_3
    move-object v2, v5

    :goto_1
    if-nez v2, :cond_4

    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    sget-object v6, La/R8;->f:[Ljava/lang/String;

    array-length v7, v6

    move v8, v3

    :goto_2
    if-ge v8, v7, :cond_6

    aget-object v9, v6, v8

    invoke-virtual {v4, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "$"

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v4, v9, v3}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_5

    goto :goto_3

    :cond_5
    add-int/2addr v8, v0

    goto :goto_2

    :cond_6
    const-string v6, "com.tencent.mm.plugin.ball.view."

    invoke-static {v4, v6, v3}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-nez v6, :cond_8

    const-string v6, "FloatBall"

    invoke-static {v4, v6, v0}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_8

    const-string v6, "Voip"

    invoke-static {v4, v6, v0}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_8

    const-string v6, "voip"

    invoke-static {v4, v6, v0}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_3

    :cond_7
    move v4, v3

    goto :goto_4

    :cond_8
    :goto_3
    move v4, v0

    :goto_4
    invoke-virtual {v2}, Landroid/view/WindowManager$LayoutParams;->getTitle()Ljava/lang/CharSequence;

    move-result-object v6

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_9

    const-string v7, "VoIP"

    invoke-static {v6, v7, v0}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-ne v6, v0, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {v2}, Landroid/view/WindowManager$LayoutParams;->getTitle()Ljava/lang/CharSequence;

    move-result-object v6

    if-eqz v6, :cond_a

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_a

    const-string v7, "call"

    invoke-static {v6, v7, v0}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-ne v6, v0, :cond_a

    :goto_5
    move v6, v0

    goto :goto_6

    :cond_a
    move v6, v3

    :goto_6
    iget v7, v2, Landroid/view/WindowManager$LayoutParams;->type:I

    const/16 v8, 0x7f6

    if-eq v7, v8, :cond_c

    const/16 v8, 0x7d3

    if-eq v7, v8, :cond_c

    const/16 v8, 0x7d6

    if-ne v7, v8, :cond_b

    goto :goto_7

    :cond_b
    move v7, v3

    goto :goto_8

    :cond_c
    :goto_7
    move v7, v0

    :goto_8
    if-nez v4, :cond_d

    if-nez v6, :cond_d

    if-nez v7, :cond_d

    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_d
    invoke-static {v1}, La/R8;->b(Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v7

    const/16 v8, 0x3e

    const-string v9, " "

    invoke-static {v7, v9, v5, v8}, La/t3;->p0(Ljava/util/Collection;Ljava/lang/String;La/D7;I)Ljava/lang/String;

    move-result-object v7

    if-nez v4, :cond_10

    if-nez v6, :cond_10

    sget-object v4, La/R8;->e:[Ljava/lang/String;

    array-length v6, v4

    move v8, v3

    :goto_9
    if-ge v8, v6, :cond_f

    aget-object v9, v4, v8

    invoke-static {v7, v9, v0}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-eqz v9, :cond_e

    goto :goto_a

    :cond_e
    add-int/2addr v8, v0

    goto :goto_9

    :cond_f
    move v0, v3

    :cond_10
    :goto_a
    invoke-static {}, La/bh;->b()Z

    move-result v3

    const-string v4, " viewClass="

    const-string v6, " type="

    const-string v8, " text="

    if-eqz v3, :cond_11

    invoke-virtual {v2}, Landroid/view/WindowManager$LayoutParams;->getTitle()Ljava/lang/CharSequence;

    move-result-object v3

    iget v9, v2, Landroid/view/WindowManager$LayoutParams;->type:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "WindowManager addView active title="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " isVoipView="

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, La/R8;->r(Ljava/lang/String;)V

    :cond_11
    if-nez v0, :cond_12

    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_12
    invoke-virtual {v2}, Landroid/view/WindowManager$LayoutParams;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->type:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v9, "WindowManager addView candidate title="

    invoke-direct {v3, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    invoke-static {v7}, La/R8;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, La/bh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, La/bh;->b()Z

    move-result v2

    if-eqz v2, :cond_13

    if-eqz v1, :cond_13

    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "WindowManager addView suppressed for active intercept user="

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/R8;->r(Ljava/lang/String;)V

    return-object v5

    :cond_13
    if-eqz v0, :cond_14

    sget-object v1, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_14

    new-instance p0, Ljava/lang/StringBuilder;

    const-string v1, "WindowManager addView suppressed for blacklisted user="

    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/R8;->r(Ljava/lang/String;)V

    invoke-static {v0}, La/bh;->g(Ljava/lang/String;)V

    return-object v5

    :cond_14
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_15
    :goto_b
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static k()Z
    .locals 1

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, La/bh;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, La/K3$a;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static n(Landroid/content/Intent;Ljava/lang/String;Z)Z
    .locals 8

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget-boolean v0, v0, La/jc;->D:Z

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-static {p0}, La/R8;->e(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, La/R8;->o(Landroid/content/Intent;)Z

    move-result p0

    const-string v2, "VoIP intent detected source="

    const-string v3, " user="

    const-string v4, " incoming="

    invoke-static {v2, p1, v3, v0, v4}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, " isActivity="

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, La/R8;->r(Ljava/lang/String;)V

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    sget-object v6, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    const-string v3, " source="

    if-eqz p2, :cond_1

    if-nez p0, :cond_1

    invoke-static {}, La/bh;->b()Z

    move-result p0

    if-nez p0, :cond_1

    new-instance p0, Ljava/lang/StringBuilder;

    const-string p2, "allow established/outgoing VoIP Activity for user="

    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/R8;->r(Ljava/lang/String;)V

    return v1

    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p2, "intercept VoIP intent for user="

    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/R8;->r(Ljava/lang/String;)V

    invoke-static {v0}, La/bh;->g(Ljava/lang/String;)V

    return v2

    :cond_2
    invoke-static {}, La/bh;->b()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {}, La/bh;->a()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    sget-object v7, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v6}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "intercept VoIP intent during active intercept source="

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, " activeUser="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/R8;->r(Ljava/lang/String;)V

    invoke-static {}, La/bh;->e()V

    return v2

    :cond_3
    if-eqz p0, :cond_4

    const-string p0, "intercept incoming VoIP intent during active intercept source="

    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/R8;->r(Ljava/lang/String;)V

    return v2

    :cond_4
    const-string p2, "allow VoIP intent source="

    invoke-static {p2, p1, v3, v0, v4}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/R8;->r(Ljava/lang/String;)V

    :cond_5
    :goto_0
    return v1
.end method

.method public static o(Landroid/content/Intent;)Z
    .locals 7

    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    :cond_3
    const-string v2, ""

    :cond_4
    sget-object v3, La/R8;->g:Ljava/util/List;

    if-eqz v3, :cond_5

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_0

    :cond_5
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/regex/Pattern;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v4

    if-eqz v4, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_7
    :goto_1
    const/4 p0, 0x0

    return p0
.end method

.method public static p(Ljava/lang/String;)Z
    .locals 8

    sget-object v0, La/R8;->d:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x1

    const-string v5, "$"

    if-ge v3, v1, :cond_1

    aget-object v6, v0, v3

    invoke-virtual {p0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, v5, v2}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sget-object v0, La/R8;->c:[Ljava/lang/String;

    array-length v1, v0

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_3

    aget-object v6, v0, v3

    invoke-virtual {p0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {p0, v6, v2}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    const-string v0, "voip"

    invoke-static {p0, v0, v4}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "wmpfvoip"

    invoke-static {p0, v0, v4}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_2

    :cond_4
    return v2

    :cond_5
    :goto_2
    return v4
.end method

.method public static q(Landroid/app/Notification;)Z
    .locals 7

    invoke-virtual {p0}, Landroid/app/Notification;->getChannelId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const-string v2, "voip"

    invoke-static {v0, v2, v1}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Landroid/app/Notification;->category:Ljava/lang/String;

    const-string v2, "call"

    invoke-static {v0, v2}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Landroid/app/Notification;->fullScreenIntent:Landroid/app/PendingIntent;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p0}, La/R8;->a(Landroid/app/Notification;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v3, La/R8;->e:[Ljava/lang/String;

    array-length v4, v3

    move v5, v2

    :goto_0
    if-ge v5, v4, :cond_4

    aget-object v6, v3, v5

    invoke-static {v0, v6, v1}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-eqz v6, :cond_5

    :goto_1
    return v1

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_6
    :goto_2
    return v2
.end method

.method public static r(Ljava/lang/String;)V
    .locals 1

    const-string v0, "[IgnoreVoipCall] "

    invoke-static {v0, p0}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->b([Ljava/lang/Object;)V

    return-void
.end method

.method public static s(Ljava/lang/String;Landroid/content/Intent;)V
    .locals 4

    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, La/R8;->p(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1}, La/R8;->u(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "VoIP intent candidate source="

    const-string v2, " component="

    const-string v3, " extras="

    invoke-static {v1, p0, v2, v0, v3}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/R8;->r(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static t(Landroid/content/Intent;)Z
    .locals 8

    invoke-virtual {p0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    invoke-static {v0}, La/R8;->p(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, La/R8;->d:[Ljava/lang/String;

    array-length v4, v3

    move v5, v2

    :goto_1
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    invoke-virtual {v0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "$"

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6, v2}, La/Ae;->H(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    move v1, v2

    :cond_3
    :goto_2
    invoke-static {p0, v0, v1}, La/R8;->n(Landroid/content/Intent;Ljava/lang/String;Z)Z

    move-result p0

    return p0

    :cond_4
    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v3, "voip"

    invoke-static {v0, v3, v1}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_5

    const-string v3, "call"

    invoke-static {v0, v3, v1}, La/Be;->I(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_6

    :cond_5
    invoke-static {p0, v0, v2}, La/R8;->n(Landroid/content/Intent;Ljava/lang/String;Z)Z

    move-result p0

    return p0

    :cond_6
    return v2
.end method

.method public static u(Landroid/content/Intent;)Ljava/lang/String;
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, ", "

    new-instance v2, La/t;

    const/4 v3, 0x6

    invoke-direct {v2, v3, p0}, La/t;-><init>(ILjava/lang/Object;)V

    const/16 p0, 0x1e

    invoke-static {v0, v1, v2, p0}, La/t3;->p0(Ljava/util/Collection;Ljava/lang/String;La/D7;I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    :cond_0
    const-string p0, "null"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object p0

    :cond_1
    :goto_0
    instance-of v0, p0, La/wd$a;

    if-eqz v0, :cond_2

    const-string p0, "error"

    :cond_2
    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final handleHook(La/J8;)V
    .locals 34

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-class v12, Landroid/view/ViewGroup$LayoutParams;

    const-class v13, Landroid/view/View;

    const-string v14, "addView"

    const-string v15, "notify"

    const-string v3, "bindService"

    const-string v10, "startForegroundService"

    const-string v11, "startActivityForResult"

    const-string v4, "android.app.NotificationManager"

    const-string v5, "startService"

    const-string v6, "startActivity"

    const-class v7, Landroid/app/Notification;

    const-class v8, Landroid/app/Service;

    const-class v9, Landroid/content/Intent;

    move-object/from16 v17, v14

    const-class v14, Landroid/os/Bundle;

    move-object/from16 v18, v12

    const-string v12, ": "

    move-object/from16 v19, v13

    const-string v13, "#"

    move-object/from16 v30, v4

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v0, "session"

    invoke-static {v2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handleHook started"

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    const-class v20, Landroid/app/Activity;

    :try_start_0
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    move-object/from16 v31, v15

    :try_start_1
    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object/from16 v32, v7

    :try_start_2
    new-instance v7, La/O8;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object/from16 v33, v12

    const/4 v12, 0x3

    :try_start_3
    invoke-direct {v7, v1, v12}, La/O8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v0, v6, v15, v7}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    :goto_0
    move-object/from16 v33, v12

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object/from16 v32, v7

    goto :goto_0

    :catchall_3
    move-exception v0

    move-object/from16 v32, v7

    move-object/from16 v33, v12

    move-object/from16 v31, v15

    :goto_1
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_2
    :try_start_4
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v9, v14}, [Ljava/lang/Class;

    move-result-object v7

    new-instance v12, La/O8;

    const/4 v15, 0x4

    invoke-direct {v12, v1, v15}, La/O8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v0, v6, v7, v12}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_3

    :catchall_4
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_3
    :try_start_5
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4}, La/i9;->b(Ljava/lang/Object;)V

    filled-new-array {v9, v4}, [Ljava/lang/Class;

    move-result-object v7

    new-instance v12, La/O8;

    const/4 v15, 0x5

    invoke-direct {v12, v1, v15}, La/O8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v0, v11, v7, v12}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_4

    :catchall_5
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_4
    :try_start_6
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4}, La/i9;->b(Ljava/lang/Object;)V

    filled-new-array {v9, v4, v14}, [Ljava/lang/Class;

    move-result-object v7

    new-instance v12, La/O8;

    const/4 v15, 0x6

    invoke-direct {v12, v1, v15}, La/O8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v0, v11, v7, v12}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_5

    :catchall_6
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_5
    const-string v0, "Activity start hooks installed"

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    const-class v7, Landroid/content/ContextWrapper;

    const-class v11, Landroid/content/Context;

    :try_start_7
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v12

    new-instance v15, La/O8;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    move-object/from16 v20, v7

    const/16 v7, 0x9

    :try_start_8
    invoke-direct {v15, v1, v7}, La/O8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v0, v6, v12, v15}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    goto :goto_7

    :catchall_7
    move-exception v0

    goto :goto_6

    :catchall_8
    move-exception v0

    move-object/from16 v20, v7

    :goto_6
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_7
    :try_start_9
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v9, v14}, [Ljava/lang/Class;

    move-result-object v7

    new-instance v12, La/O8;

    const/16 v15, 0xa

    invoke-direct {v12, v1, v15}, La/O8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v0, v6, v7, v12}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    goto :goto_8

    :catchall_9
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_8
    :try_start_a
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v7

    new-instance v12, La/O8;

    const/16 v15, 0xb

    invoke-direct {v12, v1, v15}, La/O8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v0, v5, v7, v12}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    goto :goto_9

    :catchall_a
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_9
    :try_start_b
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v7

    new-instance v12, La/O8;

    const/16 v15, 0xc

    invoke-direct {v12, v1, v15}, La/O8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v0, v10, v7, v12}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    goto :goto_a

    :catchall_b
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_a
    :try_start_c
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4}, La/i9;->b(Ljava/lang/Object;)V

    filled-new-array {v9, v8, v4}, [Ljava/lang/Class;

    move-result-object v7

    new-instance v11, La/l8;

    const/16 v12, 0x14

    invoke-direct {v11, v1, v12}, La/l8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v0, v3, v7, v11}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    goto :goto_b

    :catchall_c
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_b
    :try_start_d
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v7

    new-instance v11, La/l8;

    const/16 v12, 0x15

    invoke-direct {v11, v1, v12}, La/l8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v0, v6, v7, v11}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    goto :goto_c

    :catchall_d
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_c
    :try_start_e
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v7

    new-instance v11, La/l8;

    const/16 v12, 0x16

    invoke-direct {v11, v1, v12}, La/l8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v0, v5, v7, v11}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    goto :goto_d

    :catchall_e
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_d
    :try_start_f
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v7

    new-instance v11, La/l8;

    const/16 v12, 0x17

    invoke-direct {v11, v1, v12}, La/l8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v0, v10, v7, v11}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    goto :goto_e

    :catchall_f
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_e
    const-string v0, "Context/ContextWrapper start hooks installed (abstract method failures suppressed via runCatching)"

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :try_start_10
    const-class v0, Landroid/app/Instrumentation;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v7, "execStartActivity"

    const-class v20, Landroid/content/Context;

    const-class v21, Landroid/os/IBinder;

    const-class v22, Landroid/os/IBinder;

    const-class v23, Landroid/app/Activity;

    const-class v24, Landroid/content/Intent;

    invoke-static {v4}, La/i9;->b(Ljava/lang/Object;)V

    const-class v26, Landroid/os/Bundle;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_11

    move-object/from16 v25, v4

    :try_start_11
    filled-new-array/range {v20 .. v26}, [Ljava/lang/Class;

    move-result-object v4

    new-instance v10, La/l8;

    const/16 v11, 0x1b

    invoke-direct {v10, v1, v11}, La/l8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v0, v7, v4, v10}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_10

    goto :goto_10

    :catchall_10
    move-exception v0

    goto :goto_f

    :catchall_11
    move-exception v0

    move-object/from16 v25, v4

    :goto_f
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_10
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "Instrumentation hook failed: "

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :cond_0
    const-string v0, "Instrumentation hook installed"

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    iget-object v0, v2, La/J8;->a:Ljava/lang/ClassLoader;

    const-string v4, "android.app.IActivityTaskManager$Stub$Proxy"

    invoke-static {v0, v4}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v7, "android.app.ProfilingInfo"

    const-string v10, "android.app.IApplicationThread"

    if-nez v0, :cond_1

    const-string v0, "IActivityTaskManager proxy not found"

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    goto :goto_13

    :cond_1
    :try_start_12
    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v20

    const-class v21, Ljava/lang/String;

    const-class v22, Landroid/content/Intent;

    const-class v23, Ljava/lang/String;

    const-class v24, Landroid/os/IBinder;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_12

    move-object/from16 v26, v25

    :try_start_13
    const-class v25, Ljava/lang/String;

    invoke-static/range {v26 .. v26}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v28

    const-class v29, Landroid/os/Bundle;

    move-object/from16 v27, v26

    filled-new-array/range {v20 .. v29}, [Ljava/lang/Class;

    move-result-object v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_13

    move-object/from16 v25, v26

    :try_start_14
    new-instance v11, La/O8;

    const/4 v12, 0x2

    invoke-direct {v11, v1, v12}, La/O8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v4, v6, v0, v11}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_12

    goto :goto_12

    :catchall_12
    move-exception v0

    goto :goto_11

    :catchall_13
    move-exception v0

    move-object/from16 v25, v26

    :goto_11
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_12
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v11, "IActivityTaskManager hook failed: "

    invoke-direct {v4, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :cond_2
    const-string v0, "IActivityTaskManager proxy hook installed"

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :goto_13
    iget-object v0, v2, La/J8;->a:Ljava/lang/ClassLoader;

    const-string v4, "android.app.IActivityManager$Stub$Proxy"

    invoke-static {v0, v4}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_3

    const-string v0, "IActivityManager proxy not found"

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    move-object/from16 v5, v25

    goto/16 :goto_19

    :cond_3
    :try_start_15
    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v20

    const-class v21, Ljava/lang/String;

    const-class v22, Landroid/content/Intent;

    const-class v23, Ljava/lang/String;

    const-class v24, Landroid/os/IBinder;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_14

    move-object/from16 v26, v25

    :try_start_16
    const-class v25, Ljava/lang/String;

    invoke-static/range {v26 .. v26}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v28

    const-class v29, Landroid/os/Bundle;

    move-object/from16 v27, v26

    filled-new-array/range {v20 .. v29}, [Ljava/lang/Class;

    move-result-object v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_15

    move-object/from16 v25, v26

    :try_start_17
    new-instance v7, La/l8;

    const/16 v11, 0x18

    invoke-direct {v7, v1, v11}, La/l8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v4, v6, v0, v7}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_14

    goto :goto_15

    :catchall_14
    move-exception v0

    goto :goto_14

    :catchall_15
    move-exception v0

    move-object/from16 v25, v26

    :goto_14
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_15
    :try_start_18
    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v20

    const-class v21, Landroid/content/Intent;

    const-class v22, Ljava/lang/String;

    sget-object v23, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static/range {v23 .. v23}, La/i9;->b(Ljava/lang/Object;)V

    const-class v24, Ljava/lang/String;

    invoke-static/range {v25 .. v25}, La/i9;->b(Ljava/lang/Object;)V

    filled-new-array/range {v20 .. v25}, [Ljava/lang/Class;

    move-result-object v0

    new-instance v6, La/l8;

    const/16 v7, 0x19

    invoke-direct {v6, v1, v7}, La/l8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v4, v5, v0, v6}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_16

    goto :goto_16

    :catchall_16
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_16
    :try_start_19
    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v20

    const-class v21, Landroid/os/IBinder;

    const-class v22, Landroid/content/Intent;

    const-class v23, Ljava/lang/String;

    const-string v0, "android.app.IServiceConnection"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v24

    invoke-static/range {v25 .. v25}, La/i9;->b(Ljava/lang/Object;)V

    const-class v26, Ljava/lang/String;

    move-object/from16 v27, v25

    filled-new-array/range {v20 .. v27}, [Ljava/lang/Class;

    move-result-object v0
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_18

    move-object/from16 v5, v25

    :try_start_1a
    new-instance v6, La/l8;

    const/16 v7, 0x1a

    invoke-direct {v6, v1, v7}, La/l8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v4, v3, v0, v6}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_17

    goto :goto_18

    :catchall_17
    move-exception v0

    goto :goto_17

    :catchall_18
    move-exception v0

    move-object/from16 v5, v25

    :goto_17
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_18
    const-string v0, "IActivityManager proxy hooks installed"

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :goto_19
    const-string v0, "hookIncomingCallHandler hooking "

    :try_start_1b
    iget-object v3, v2, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {v3}, La/ah;->f(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object v3

    if-nez v3, :cond_4

    const-string v0, "incoming call handler method not resolved"

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :goto_1a
    move-object/from16 v3, v33

    goto :goto_1c

    :catchall_19
    move-exception v0

    goto :goto_1b

    :cond_4
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object v0

    new-instance v3, La/v8;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, La/v8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-interface {v0, v3}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_19

    goto :goto_1a

    :goto_1b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "hookIncomingCallHandler fail: "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v3, v33

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :goto_1c
    const-string v0, "hookIncomingCallUi hooking "

    :try_start_1c
    iget-object v4, v2, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {v4}, La/ah;->h(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object v4

    if-nez v4, :cond_5

    const-string v0, "incoming call UI method not resolved"

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    goto :goto_1e

    :catchall_1a
    move-exception v0

    goto :goto_1d

    :cond_5
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object v0

    new-instance v4, La/v8;

    const/4 v12, 0x3

    invoke-direct {v4, v1, v12}, La/v8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-interface {v0, v4}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_1a

    goto :goto_1e

    :goto_1d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "hookIncomingCallUi fail: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :goto_1e
    const-string v0, "hookIncomingCallManager hooking "

    :try_start_1d
    iget-object v4, v2, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {v4}, La/ah;->g(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object v4

    if-nez v4, :cond_6

    const-string v0, "incoming call manager method not resolved"

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    goto :goto_20

    :catchall_1b
    move-exception v0

    goto :goto_1f

    :cond_6
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object v0

    new-instance v4, La/v8;

    const/4 v15, 0x5

    invoke-direct {v4, v1, v15}, La/v8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-interface {v0, v4}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_1b

    goto :goto_20

    :goto_1f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "hookIncomingCallManager fail: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :goto_20
    :try_start_1e
    iget-object v0, v2, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {v0}, La/ah;->e(Ljava/lang/ClassLoader;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_7

    const-string v0, "voip mgr bind methods not resolved"

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    goto :goto_23

    :catchall_1c
    move-exception v0

    goto :goto_22

    :cond_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/reflect/Method;

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "hookVoipMgrBind hooking "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, La/R8;->r(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object v4

    new-instance v6, La/v8;

    const/4 v12, 0x2

    invoke-direct {v6, v1, v12}, La/v8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-interface {v4, v6}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_1c

    goto :goto_21

    :goto_22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "hookVoipMgrBind fail: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :cond_8
    :goto_23
    :try_start_1f
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v4, "startForeground"

    invoke-static {v5}, La/i9;->b(Ljava/lang/Object;)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_1e

    move-object/from16 v6, v32

    :try_start_20
    filled-new-array {v5, v6}, [Ljava/lang/Class;

    move-result-object v7

    new-instance v8, La/O8;

    const/16 v10, 0x8

    invoke-direct {v8, v1, v10}, La/O8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v0, v4, v7, v8}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v0
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_1d

    goto :goto_25

    :catchall_1d
    move-exception v0

    goto :goto_24

    :catchall_1e
    move-exception v0

    move-object/from16 v6, v32

    :goto_24
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_25
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "Service.startForeground hook failed: "

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :cond_9
    const-string v0, "Service.startForeground hook installed"

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    sget-object v4, La/R8;->c:[Ljava/lang/String;

    array-length v7, v4

    const/4 v8, 0x0

    :goto_26
    if-ge v8, v7, :cond_c

    aget-object v10, v4, v8

    iget-object v0, v2, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {v0, v10}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_a

    const-string v0, "service class not found: "

    invoke-virtual {v0, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :goto_27
    const/16 v16, 0x1

    goto :goto_29

    :cond_a
    :try_start_21
    const-string v0, "onStartCommand"

    invoke-static {v5}, La/i9;->b(Ljava/lang/Object;)V

    filled-new-array {v9, v5, v5}, [Ljava/lang/Class;

    move-result-object v11

    new-instance v12, La/P8;

    const/4 v15, 0x0

    invoke-direct {v12, v1, v10, v15}, La/P8;-><init>(La/R8;Ljava/lang/String;I)V

    invoke-static {v2, v10, v0, v11, v12}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v0
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_1f

    goto :goto_28

    :catchall_1f
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_28
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "VoIP service onStartCommand hook failed: "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :cond_b
    :try_start_22
    const-string v0, "onDestroy"

    new-instance v11, La/P8;

    const/4 v12, 0x1

    invoke-direct {v11, v1, v10, v12}, La/P8;-><init>(La/R8;Ljava/lang/String;I)V

    invoke-static {v2, v10, v0, v11}, La/J8;->e(La/J8;Ljava/lang/String;Ljava/lang/String;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_20

    goto :goto_27

    :catchall_20
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    goto :goto_27

    :goto_29
    add-int/lit8 v8, v8, 0x1

    goto :goto_26

    :cond_c
    const-class v4, Ljava/lang/String;

    :try_start_23
    invoke-static {v5}, La/i9;->b(Ljava/lang/Object;)V

    filled-new-array {v4, v5, v6}, [Ljava/lang/Class;

    move-result-object v0

    new-instance v7, La/l8;

    const/16 v8, 0x1c

    invoke-direct {v7, v1, v8}, La/l8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_22

    move-object/from16 v9, v30

    move-object/from16 v8, v31

    :try_start_24
    invoke-static {v2, v9, v8, v0, v7}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v0
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_21

    goto :goto_2b

    :catchall_21
    move-exception v0

    goto :goto_2a

    :catchall_22
    move-exception v0

    move-object/from16 v9, v30

    move-object/from16 v8, v31

    :goto_2a
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_2b
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v10, "NotificationManager.notify(String) hook failed: "

    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :cond_d
    :try_start_25
    invoke-static {v5}, La/i9;->b(Ljava/lang/Object;)V

    filled-new-array {v5, v6}, [Ljava/lang/Class;

    move-result-object v0

    new-instance v7, La/l8;

    const/16 v10, 0x1d

    invoke-direct {v7, v1, v10}, La/l8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v9, v8, v0, v7}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v0
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_23

    goto :goto_2c

    :catchall_23
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_2c
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "NotificationManager.notify(int) hook failed: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :cond_e
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0x1d

    if-lt v0, v10, :cond_f

    :try_start_26
    const-string v0, "notifyAsPackage"

    invoke-static {v5}, La/i9;->b(Ljava/lang/Object;)V

    filled-new-array {v4, v4, v5, v6}, [Ljava/lang/Class;

    move-result-object v4

    new-instance v5, La/O8;

    const/4 v15, 0x0

    invoke-direct {v5, v1, v15}, La/O8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v9, v0, v4, v5}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v0
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_24

    goto :goto_2d

    :catchall_24
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_2d
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "NotificationManager.notifyAsPackage hook failed: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :cond_f
    :try_start_27
    const-class v0, Landroid/telecom/TelecomManager;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v4, "addNewIncomingCall"

    const-class v5, Landroid/telecom/PhoneAccountHandle;

    filled-new-array {v5, v14}, [Ljava/lang/Class;

    move-result-object v5

    new-instance v6, La/O8;

    const/4 v7, 0x7

    invoke-direct {v6, v1, v7}, La/O8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-static {v2, v0, v4, v5, v6}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    const-string v0, "TelecomManager hook installed"

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_25

    goto :goto_2e

    :catchall_25
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_2e
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "TelecomManager hook failed: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :cond_10
    invoke-virtual/range {p0 .. p1}, La/R8;->m(La/J8;)V

    const-string v4, "hookFlutterGlobal hooking "

    :try_start_28
    new-instance v5, La/fd;

    sget v0, La/B1;->a:I
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_26

    const/4 v6, -0x1

    if-ne v0, v6, :cond_11

    :try_start_29
    sget-object v0, La/w1;->p:Landroid/content/Context;

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v7, "com.tencent.mm"

    const/4 v15, 0x0

    invoke-virtual {v0, v7, v15}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v6, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_29} :catch_0
    .catchall {:try_start_29 .. :try_end_29} :catchall_26

    goto :goto_2f

    :catch_0
    move-exception v0

    :try_start_2a
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v12, 0x1

    invoke-static {v0, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->a([Ljava/lang/Object;)V

    :goto_2f
    sput v6, La/B1;->a:I

    :cond_11
    sget v0, La/B1;->a:I

    iget-object v6, v2, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-direct {v5, v0, v6}, La/fd;-><init>(ILjava/lang/ClassLoader;)V

    sget-object v0, La/hd;->a:La/hd;

    const-string v6, "F017:flutterVoip"

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v5}, La/hd;->a(Ljava/lang/String;La/fd;)La/gd;

    move-result-object v0

    iget-object v0, v0, La/gd;->b:Ljava/lang/Class;

    if-nez v0, :cond_12

    goto :goto_30

    :cond_12
    new-instance v5, La/O8;

    const/4 v12, 0x1

    invoke-direct {v5, v12}, La/O8;-><init>(I)V

    invoke-static {v0, v5}, La/A1;->f(Ljava/lang/Class;La/D7;)[Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-static {v5}, La/N1;->d0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/reflect/Method;

    if-nez v5, :cond_13

    goto :goto_30

    :cond_13
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object v0

    new-instance v4, La/v8;

    const/4 v15, 0x4

    invoke-direct {v4, v1, v15}, La/v8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V

    invoke-interface {v0, v4}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_26

    goto :goto_30

    :catchall_26
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "hookFlutterGlobal fail: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :goto_30
    :try_start_2b
    const-string v0, "android.view.WindowManagerImpl"
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_29

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    :try_start_2c
    filled-new-array {v4, v3}, [Ljava/lang/Class;

    move-result-object v5

    new-instance v6, La/l8;

    const/16 v7, 0x13

    invoke-direct {v6, v1, v7}, La/l8;-><init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;I)V
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_28

    move-object/from16 v7, v17

    :try_start_2d
    invoke-static {v2, v0, v7, v5, v6}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v0
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_27

    goto :goto_32

    :catchall_27
    move-exception v0

    goto :goto_31

    :catchall_28
    move-exception v0

    move-object/from16 v7, v17

    goto :goto_31

    :catchall_29
    move-exception v0

    move-object/from16 v7, v17

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    :goto_31
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_32
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "WindowManagerImpl.addView hook failed: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :cond_14
    const-string v0, "WindowManagerImpl addView hook installed"

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :try_start_2e
    const-string v0, "android.view.WindowManagerGlobal"

    const-class v5, Landroid/view/Display;

    const-class v6, Landroid/view/Window;

    filled-new-array {v4, v3, v5, v6}, [Ljava/lang/Class;

    move-result-object v3

    new-instance v5, La/N8;

    const/4 v15, 0x0

    invoke-direct {v5, v1, v15}, La/N8;-><init>(La/R8;I)V

    invoke-static {v2, v0, v7, v3, v5}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v0
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_2a

    goto :goto_33

    :catchall_2a
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_33
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "WindowManagerGlobal.addView hook failed: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :cond_15
    const-string v0, "WindowManager addView hook installed"

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :try_start_2f
    const-class v0, Landroid/app/Dialog;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "show"

    new-instance v5, La/N8;

    const/16 v15, 0xb

    invoke-direct {v5, v1, v15}, La/N8;-><init>(La/R8;I)V

    invoke-static {v2, v0, v3, v5}, La/J8;->e(La/J8;Ljava/lang/String;Ljava/lang/String;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v0
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_2b

    goto :goto_34

    :catchall_2b
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_34
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Dialog.show hook failed: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :cond_16
    :try_start_30
    const-class v0, Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "showAtLocation"

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v5}, La/i9;->b(Ljava/lang/Object;)V

    filled-new-array {v4, v5, v5, v5}, [Ljava/lang/Class;

    move-result-object v4

    new-instance v5, La/N8;

    const/16 v15, 0xc

    invoke-direct {v5, v1, v15}, La/N8;-><init>(La/R8;I)V

    invoke-static {v2, v0, v3, v4, v5}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v0
    :try_end_30
    .catchall {:try_start_30 .. :try_end_30} :catchall_2c

    goto :goto_35

    :catchall_2c
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_35
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "PopupWindow.showAtLocation hook failed: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    :cond_17
    const-string v0, "Dialog/PopupWindow hooks installed"

    invoke-static {v0}, La/R8;->r(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p1}, La/R8;->l(La/J8;)V

    return-void
.end method

.method public final i(Lio/github/libxposed/api/XposedInterface$Chain;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 9

    sget-object v0, La/K3;->a:La/K3$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v0

    iget-boolean v0, v0, La/jc;->D:Z

    if-nez v0, :cond_0

    goto/16 :goto_6

    :cond_0
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/app/Activity;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v0, Landroid/app/Activity;

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_3

    invoke-static {v1}, La/R8;->e(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v2

    :cond_3
    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_4

    invoke-static {v1}, La/R8;->o(Landroid/content/Intent;)Z

    move-result v1

    if-ne v1, v4, :cond_4

    move v1, v4

    goto :goto_2

    :cond_4
    move v1, v3

    :goto_2
    invoke-static {}, La/K3$a;->l()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v5

    iget-boolean v5, v5, La/jc;->D:Z

    if-nez v5, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {}, La/bh;->a()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_6

    sget-object v6, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v5}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    move v5, v4

    goto :goto_4

    :cond_6
    if-eqz v2, :cond_7

    sget-object v5, La/fh;->G:Ljava/util/concurrent/ExecutorService;

    invoke-static {v2}, La/fh$a;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    move v5, v1

    goto :goto_4

    :cond_7
    :goto_3
    move v5, v3

    :goto_4
    if-eqz v5, :cond_f

    if-nez v2, :cond_8

    invoke-static {}, La/bh;->a()Ljava/lang/String;

    move-result-object v5

    goto :goto_5

    :cond_8
    move-object v5, v2

    :goto_5
    const-string v6, "block VoIP activity "

    const-string v7, " stage="

    const-string v8, " user="

    invoke-static {v6, p2, v7, p3, v8}, La/z;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " incoming="

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, La/R8;->r(Ljava/lang/String;)V

    if-eqz v2, :cond_9

    invoke-static {v2}, La/bh;->g(Ljava/lang/String;)V

    :cond_9
    iget-object v1, p0, La/R8;->a:Ljava/util/Set;

    invoke-interface {v1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_e

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    const-string p2, "onCreate"

    invoke-virtual {p3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-static {}, La/bh;->b()Z

    move-result p2

    if-nez p2, :cond_b

    :cond_a
    iget-boolean p2, p0, La/R8;->b:Z

    if-eqz p2, :cond_c

    :cond_b
    move v3, v4

    :cond_c
    if-eqz v3, :cond_d

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_d
    return-object p1

    :cond_e
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_f
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_10
    :goto_6
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(La/J8;)V
    .locals 13

    const-string v1, "startTone"

    const-string v2, "start"

    const-string v3, "vibrate"

    const-string v4, "play"

    const-class v5, Landroid/media/ToneGenerator;

    const-class v6, Landroid/media/AudioTrack;

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    :try_start_0
    const-class v0, Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v8, La/N8;

    const/4 v9, 0x1

    invoke-direct {v8, p0, v9}, La/N8;-><init>(La/R8;I)V

    invoke-static {p1, v0, v2, v8}, La/J8;->e(La/J8;Ljava/lang/String;Ljava/lang/String;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_0
    :try_start_1
    const-class v0, Landroid/media/SoundPool;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7}, La/i9;->b(Ljava/lang/Object;)V

    sget-object v8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v8}, La/i9;->b(Ljava/lang/Object;)V

    move-object v9, v8

    move-object v10, v7

    move-object v11, v7

    move-object v12, v8

    filled-new-array/range {v7 .. v12}, [Ljava/lang/Class;

    move-result-object v8

    new-instance v9, La/N8;

    const/4 v10, 0x2

    invoke-direct {v9, p0, v10}, La/N8;-><init>(La/R8;I)V

    invoke-static {p1, v0, v4, v8, v9}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_1
    :try_start_2
    const-class v0, Landroid/media/Ringtone;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v8, La/N8;

    const/4 v9, 0x3

    invoke-direct {v8, p0, v9}, La/N8;-><init>(La/R8;I)V

    invoke-static {p1, v0, v4, v8}, La/J8;->e(La/J8;Ljava/lang/String;Ljava/lang/String;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_2
    :try_start_3
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v8, La/N8;

    const/4 v9, 0x4

    invoke-direct {v8, p0, v9}, La/N8;-><init>(La/R8;I)V

    invoke-static {p1, v0, v4, v8}, La/J8;->e(La/J8;Ljava/lang/String;Ljava/lang/String;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_3
    :try_start_4
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v4, La/N8;

    const/4 v6, 0x5

    invoke-direct {v4, p0, v6}, La/N8;-><init>(La/R8;I)V

    invoke-static {p1, v0, v2, v4}, La/J8;->e(La/J8;Ljava/lang/String;Ljava/lang/String;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_4

    :catchall_4
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_4
    :try_start_5
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7}, La/i9;->b(Ljava/lang/Object;)V

    filled-new-array {v7}, [Ljava/lang/Class;

    move-result-object v2

    new-instance v4, La/N8;

    const/4 v6, 0x6

    invoke-direct {v4, p0, v6}, La/N8;-><init>(La/R8;I)V

    invoke-static {p1, v0, v1, v2, v4}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_5

    :catchall_5
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_5
    :try_start_6
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7}, La/i9;->b(Ljava/lang/Object;)V

    filled-new-array {v7, v7}, [Ljava/lang/Class;

    move-result-object v2

    new-instance v4, La/N8;

    const/4 v5, 0x7

    invoke-direct {v4, p0, v5}, La/N8;-><init>(La/R8;I)V

    invoke-static {p1, v0, v1, v2, v4}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_6

    :catchall_6
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_6
    const-class v1, Landroid/os/Vibrator;

    :try_start_7
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v2}, La/i9;->b(Ljava/lang/Object;)V

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    new-instance v4, La/N8;

    const/16 v5, 0x8

    invoke-direct {v4, p0, v5}, La/N8;-><init>(La/R8;I)V

    invoke-static {p1, v0, v3, v2, v4}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    goto :goto_7

    :catchall_7
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_7
    :try_start_8
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-class v2, [J

    invoke-static {v7}, La/i9;->b(Ljava/lang/Object;)V

    filled-new-array {v2, v7}, [Ljava/lang/Class;

    move-result-object v2

    new-instance v4, La/N8;

    const/16 v5, 0x9

    invoke-direct {v4, p0, v5}, La/N8;-><init>(La/R8;I)V

    invoke-static {p1, v0, v3, v2, v4}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    goto :goto_8

    :catchall_8
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_8
    :try_start_9
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-class v1, Landroid/os/VibrationEffect;

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v1

    new-instance v2, La/N8;

    const/16 v4, 0xa

    invoke-direct {v2, p0, v4}, La/N8;-><init>(La/R8;I)V

    invoke-static {p1, v0, v3, v1, v2}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    goto :goto_9

    :catchall_9
    move-exception v0

    move-object p1, v0

    invoke-static {p1}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :goto_9
    const-string p1, "Audio/vibration hooks installed"

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    return-void
.end method

.method public final m(La/J8;)V
    .locals 9

    const-string v0, ": "

    :try_start_0
    sget-object v1, La/R8;->d:[Ljava/lang/String;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_4

    aget-object v4, v1, v3

    iget-object v5, p1, La/J8;->a:Ljava/lang/ClassLoader;

    invoke-static {v5, v4}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    if-nez v5, :cond_0

    goto/16 :goto_5

    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "hookVoipActivities: hooking "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, La/R8;->r(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v5, "onCreate"

    const-class v6, Landroid/os/Bundle;

    filled-new-array {v6}, [Ljava/lang/Class;

    move-result-object v6

    new-instance v7, La/P8;

    const/4 v8, 0x2

    invoke-direct {v7, p0, v4, v8}, La/P8;-><init>(La/R8;Ljava/lang/String;I)V

    invoke-static {p1, v4, v5, v6, v7}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v5

    :try_start_2
    invoke-static {v5}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v5

    :goto_1
    invoke-static {v5}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "hookVoipActivities onCreate fail "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, La/R8;->r(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    goto/16 :goto_6

    :cond_1
    :goto_2
    :try_start_3
    const-string v5, "onResume"

    new-instance v6, La/P8;

    const/4 v7, 0x3

    invoke-direct {v6, p0, v4, v7}, La/P8;-><init>(La/R8;Ljava/lang/String;I)V

    invoke-static {p1, v4, v5, v6}, La/J8;->e(La/J8;Ljava/lang/String;Ljava/lang/String;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v5

    :try_start_4
    invoke-static {v5}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v5

    :goto_3
    invoke-static {v5}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "hookVoipActivities onResume fail "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, La/R8;->r(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_2
    :try_start_5
    const-string v5, "onNewIntent"

    const-class v6, Landroid/content/Intent;

    filled-new-array {v6}, [Ljava/lang/Class;

    move-result-object v6

    new-instance v7, La/P8;

    const/4 v8, 0x4

    invoke-direct {v7, p0, v4, v8}, La/P8;-><init>(La/R8;Ljava/lang/String;I)V

    invoke-static {p1, v4, v5, v6, v7}, La/J8;->a(La/J8;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;La/D7;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    move-result-object v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v5

    :try_start_6
    invoke-static {v5}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v5

    :goto_4
    invoke-static {v5}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "hookVoipActivities onNewIntent fail "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, La/R8;->r(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :cond_3
    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :goto_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "hookVoipActivities fail: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La/R8;->r(Ljava/lang/String;)V

    :cond_4
    return-void
.end method
