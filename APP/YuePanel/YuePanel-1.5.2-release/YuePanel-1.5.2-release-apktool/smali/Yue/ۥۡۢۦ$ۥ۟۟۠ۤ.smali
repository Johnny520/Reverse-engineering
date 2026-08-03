.class public LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;
.super LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06e0\u06e4"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;,
        LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟;,
        LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ;,
        LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۤ:Ljava/lang/String; = "androidx.core.app.NotificationCompat$MessagingStyle"

.field public static final ۥ۟۟۟ۥ:I = 0x19


# instance fields
.field public final ۥ۟۟۟۟:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e2\u06e6$\u06e5\u06df\u06df\u06e0\u06e4$\u06e5\u06df\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟۠:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e2\u06e6$\u06e5\u06df\u06df\u06e0\u06e4$\u06e5\u06df\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟ۡ:LYue/ۥۡۤ۠ۥ;

.field public ۥ۟۟۟ۢ:Ljava/lang/CharSequence;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public ۥۣ۟۟۟:Ljava/lang/Boolean;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۠:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۤ۠ۥ;)V
    .locals 1
    .param p1    # LYue/ۥۡۤ۠ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 8
    invoke-direct {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;-><init>()V

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۠:Ljava/util/List;

    .line 11
    invoke-virtual {p1}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۠()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 12
    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۡ:LYue/ۥۡۤ۠ۥ;

    return-void

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "User\'s name must not be empty."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 4
    invoke-direct {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;-><init>()V

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۠:Ljava/util/List;

    .line 7
    new-instance v0, LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    invoke-direct {v0}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;-><init>()V

    invoke-virtual {v0, p1}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟۠(Ljava/lang/CharSequence;)LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ()LYue/ۥۡۤ۠ۥ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۡ:LYue/ۥۡۤ۠ۥ;

    return-void
.end method

.method public static ۥۣ۟۟ۡ(Landroid/app/Notification;)LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;
    .locals 1
    .param p0    # Landroid/app/Notification;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-static {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟۠ۢ(Landroid/app/Notification;)LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;

    move-result-object p0

    instance-of v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;

    if-eqz v0, :cond_0

    check-cast p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public ۥ(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-super {p0, p1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ(Landroid/os/Bundle;)V

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۡ:LYue/ۥۡۤ۠ۥ;

    invoke-virtual {v0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۠()Ljava/lang/CharSequence;

    move-result-object v0

    const-string v1, "android.selfDisplayName"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۡ:LYue/ۥۡۤ۠ۥ;

    invoke-virtual {v0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۧ()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android.messagingStyleUser"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const-string v0, "android.hiddenConversationTitle"

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥۣ۟۟۟:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "android.conversationTitle"

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-static {v0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ(Ljava/util/List;)[Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android.messages"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    :cond_1
    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-static {v0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ(Ljava/util/List;)[Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android.messages.historic"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    :cond_2
    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥۣ۟۟۟:Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    const-string v1, "android.isGroupConversation"

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_3
    return-void
.end method

.method public ۥ۟(LYue/ۥۡۢۥۥ;)V
    .locals 4
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟ۢ۠()Z

    move-result v0

    invoke-virtual {p0, v0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟ۢۤ(Z)LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۡ:LYue/ۥۡۤ۠ۥ;

    invoke-virtual {v0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۥ()Landroid/app/Person;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟;->ۥ(Landroid/app/Person;)Landroid/app/Notification$MessagingStyle;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۡ:LYue/ۥۡۤ۠ۥ;

    invoke-virtual {v0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۠()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ;->ۥ۟(Ljava/lang/CharSequence;)Landroid/app/Notification$MessagingStyle;

    move-result-object v0

    :goto_0
    iget-object v2, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;

    invoke-virtual {v3}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۟ۦ()Landroid/app/Notification$MessagingStyle$Message;

    move-result-object v3

    invoke-static {v0, v3}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ;->ۥ(Landroid/app/Notification$MessagingStyle;Landroid/app/Notification$MessagingStyle$Message;)Landroid/app/Notification$MessagingStyle;

    goto :goto_1

    :cond_1
    iget-object v2, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;

    invoke-virtual {v3}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۟ۦ()Landroid/app/Notification$MessagingStyle$Message;

    move-result-object v3

    invoke-static {v0, v3}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟;->ۥ(Landroid/app/Notification$MessagingStyle;Landroid/app/Notification$MessagingStyle$Message;)Landroid/app/Notification$MessagingStyle;

    goto :goto_2

    :cond_2
    iget-object v2, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥۣ۟۟۟:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_3

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v1, :cond_4

    :cond_3
    iget-object v2, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

    invoke-static {v0, v2}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ;->ۥ۟۟(Landroid/app/Notification$MessagingStyle;Ljava/lang/CharSequence;)Landroid/app/Notification$MessagingStyle;

    :cond_4
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v1, :cond_5

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥۣ۟۟۟:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v0, v1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟;->ۥ۟(Landroid/app/Notification$MessagingStyle;Z)Landroid/app/Notification$MessagingStyle;

    :cond_5
    invoke-interface {p1}, LYue/ۥۡۢۥۥ;->ۥ()Landroid/app/Notification$Builder;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/app/Notification$Style;->setBuilder(Landroid/app/Notification$Builder;)V

    return-void
.end method

.method public ۥ۟۟۟ۡ(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟۟ۡ(Landroid/os/Bundle;)V

    const-string v0, "android.messagingStyleUser"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v0, "android.selfDisplayName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v0, "android.conversationTitle"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v0, "android.hiddenConversationTitle"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v0, "android.messages"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v0, "android.messages.historic"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v0, "android.isGroupConversation"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    return-void
.end method

.method public ۥۣ۟۟۠()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const-string v0, "androidx.core.app.NotificationCompat$MessagingStyle"

    return-object v0
.end method

.method public ۥ۟۟۠ۨ(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟۠ۨ(Landroid/os/Bundle;)V

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const-string v0, "android.messagingStyleUser"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۤ۠ۥ;->ۥ۟(Landroid/os/Bundle;)LYue/ۥۡۤ۠ۥ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۡ:LYue/ۥۡۤ۠ۥ;

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    invoke-direct {v0}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;-><init>()V

    const-string v1, "android.selfDisplayName"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟۠(Ljava/lang/CharSequence;)LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ()LYue/ۥۡۤ۠ۥ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۡ:LYue/ۥۡۤ۠ۥ;

    :goto_0
    const-string v0, "android.conversationTitle"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

    if-nez v0, :cond_1

    const-string v0, "android.hiddenConversationTitle"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

    :cond_1
    const-string v0, "android.messages"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-static {v0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۟۠([Landroid/os/Parcelable;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    const-string v0, "android.messages.historic"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-static {v0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۟۠([Landroid/os/Parcelable;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_3
    const-string v0, "android.isGroupConversation"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥۣ۟۟۟:Ljava/lang/Boolean;

    :cond_4
    return-void
.end method

.method public ۥ۟۟ۡ۟(LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;)LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;
    .locals 1
    .param p1    # LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/16 v0, 0x19

    if-le p1, v0, :cond_0

    iget-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۠:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public ۥ۟۟ۡ۠(LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;)LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;
    .locals 1
    .param p1    # LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/16 v0, 0x19

    if-le p1, v0, :cond_0

    iget-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public ۥ۟۟ۡۡ(Ljava/lang/CharSequence;JLYue/ۥۡۤ۠ۥ;)LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۡۤ۠ۥ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;

    invoke-direct {v0, p1, p2, p3, p4}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;-><init>(Ljava/lang/CharSequence;JLYue/ۥۡۤ۠ۥ;)V

    invoke-virtual {p0, v0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟ۡ۠(LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;)LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;

    return-object p0
.end method

.method public ۥ۟۟ۡۢ(Ljava/lang/CharSequence;JLjava/lang/CharSequence;)LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;
    .locals 3
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    new-instance v1, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;

    new-instance v2, LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    invoke-direct {v2}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;-><init>()V

    invoke-virtual {v2, p4}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ۟۟۟۠(Ljava/lang/CharSequence;)LYue/ۥۡۤ۠ۥ$ۥ۟۟;

    move-result-object p4

    invoke-virtual {p4}, LYue/ۥۡۤ۠ۥ$ۥ۟۟;->ۥ()LYue/ۥۡۤ۠ۥ;

    move-result-object p4

    invoke-direct {v1, p1, p2, p3, p4}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;-><init>(Ljava/lang/CharSequence;JLYue/ۥۡۤ۠ۥ;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/16 p2, 0x19

    if-le p1, p2, :cond_0

    iget-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public final ۥ۟۟ۡۤ()LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;
    .locals 3
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;

    invoke-virtual {v1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۟ۡ()LYue/ۥۡۤ۠ۥ;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۟ۡ()LYue/ۥۡۤ۠ۥ;

    move-result-object v2

    invoke-virtual {v2}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۠()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟ۡۥ()Ljava/lang/CharSequence;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public ۥ۟۟ۡۦ()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e2\u06e6$\u06e5\u06df\u06df\u06e0\u06e4$\u06e5\u06df\u06df\u06df;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۠:Ljava/util/List;

    return-object v0
.end method

.method public ۥ۟۟ۡۧ()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e2\u06e6$\u06e5\u06df\u06df\u06e0\u06e4$\u06e5\u06df\u06df\u06df;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    return-object v0
.end method

.method public ۥ۟۟ۡۨ()LYue/ۥۡۤ۠ۥ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۡ:LYue/ۥۡۤ۠ۥ;

    return-object v0
.end method

.method public ۥ۟۟ۢ()Ljava/lang/CharSequence;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۡ:LYue/ۥۡۤ۠ۥ;

    invoke-virtual {v0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۠()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟ۢ۟()Z
    .locals 4

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v2, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;

    invoke-virtual {v2}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۟ۡ()LYue/ۥۡۤ۠ۥ;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۟ۡ()LYue/ۥۡۤ۠ۥ;

    move-result-object v2

    invoke-virtual {v2}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۠()Ljava/lang/CharSequence;

    move-result-object v2

    if-nez v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟ۢ۠()Z
    .locals 3

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, v0, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v2, 0x1c

    if-ge v0, v2, :cond_1

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥۣ۟۟۟:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥۣ۟۟۟:Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_2
    return v1
.end method

.method public final ۥ۟۟ۢۡ(I)Landroid/text/style/TextAppearanceSpan;
    .locals 7
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v6, Landroid/text/style/TextAppearanceSpan;

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Landroid/text/style/TextAppearanceSpan;-><init>(Ljava/lang/String;IILandroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V

    return-object v6
.end method

.method public final ۥ۟۟ۢۢ(LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;)Ljava/lang/CharSequence;
    .locals 7
    .param p1    # LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {}, LYue/ۥ۟ۢۦۨ;->ۥ۟۟()LYue/ۥ۟ۢۦۨ;

    move-result-object v0

    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۟ۡ()LYue/ۥۡۤ۠ۥ;

    move-result-object v2

    const-string v3, ""

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۟ۡ()LYue/ۥۡۤ۠ۥ;

    move-result-object v2

    invoke-virtual {v2}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۠()Ljava/lang/CharSequence;

    move-result-object v2

    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    const/high16 v5, -0x1000000

    if-eqz v4, :cond_1

    iget-object v2, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۡ:LYue/ۥۡۤ۠ۥ;

    invoke-virtual {v2}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۠()Ljava/lang/CharSequence;

    move-result-object v2

    iget-object v4, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    invoke-virtual {v4}, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۡ()I

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    invoke-virtual {v4}, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۡ()I

    move-result v5

    :cond_1
    invoke-virtual {v0, v2}, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۟ۧ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    invoke-virtual {p0, v5}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟ۢۡ(I)Landroid/text/style/TextAppearanceSpan;

    move-result-object v4

    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v5

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    sub-int/2addr v5, v2

    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    const/16 v6, 0x21

    invoke-virtual {v1, v4, v5, v2, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥۣ۟۟۟()Ljava/lang/CharSequence;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥۣ۟۟۟()Ljava/lang/CharSequence;

    move-result-object v3

    :goto_1
    const-string p1, "  "

    invoke-virtual {v1, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    invoke-virtual {v0, v3}, LYue/ۥ۟ۢۦۨ;->ۥ۟۟۟ۧ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    return-object v1
.end method

.method public ۥۣ۟۟ۢ(Ljava/lang/CharSequence;)LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥ۟۟۟ۢ:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public ۥ۟۟ۢۤ(Z)LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۤ;->ۥۣ۟۟۟:Ljava/lang/Boolean;

    return-object p0
.end method
