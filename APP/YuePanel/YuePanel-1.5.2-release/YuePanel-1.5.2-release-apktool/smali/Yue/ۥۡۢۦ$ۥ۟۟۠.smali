.class public LYue/ۥۡۢۦ$ۥ۟۟۠;
.super LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06e0"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟۟۟;,
        LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟;,
        LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟۟۠;,
        LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟;,
        LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟۟;,
        LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ;,
        LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟۟ۡ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠:Ljava/lang/String; = "androidx.core.app.NotificationCompat$CallStyle"

.field public static final ۥ۟۟۠۟:I = 0x0

.field public static final ۥ۟۟۠۠:I = 0x1

.field public static final ۥ۟۟۠ۡ:I = 0x2

.field public static final ۥ۟۟۠ۢ:I = 0x3

.field public static final ۥۣ۟۟۠:Ljava/lang/String; = "key_action_priority"


# instance fields
.field public ۥ۟۟۟۟:I

.field public ۥ۟۟۟۠:LYue/ۥۡۤ۠ۥ;

.field public ۥ۟۟۟ۡ:Landroid/app/PendingIntent;

.field public ۥ۟۟۟ۢ:Landroid/app/PendingIntent;

.field public ۥۣ۟۟۟:Landroid/app/PendingIntent;

.field public ۥ۟۟۟ۤ:Z

.field public ۥ۟۟۟ۥ:Ljava/lang/Integer;

.field public ۥ۟۟۟ۦ:Ljava/lang/Integer;

.field public ۥ۟۟۟ۧ:Landroidx/core/graphics/drawable/IconCompat;

.field public ۥ۟۟۟ۨ:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;-><init>()V

    return-void
.end method

.method public constructor <init>(ILYue/ۥۡۤ۠ۥ;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
    .locals 1
    .param p2    # LYue/ۥۡۤ۠ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p5    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 4
    invoke-direct {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;-><init>()V

    if-eqz p2, :cond_0

    .line 5
    invoke-virtual {p2}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۠()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 6
    iput p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟۟:I

    .line 7
    iput-object p2, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟۠:LYue/ۥۡۤ۠ۥ;

    .line 8
    iput-object p5, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۡ:Landroid/app/PendingIntent;

    .line 9
    iput-object p4, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۢ:Landroid/app/PendingIntent;

    .line 10
    iput-object p3, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥۣ۟۟۟:Landroid/app/PendingIntent;

    return-void

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "person must have a non-empty a name"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;)V
    .locals 0
    .param p1    # LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;-><init>()V

    .line 3
    invoke-virtual {p0, p1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ۟۟ۡ(LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;)V

    return-void
.end method

.method public static ۥ۟۟ۡ۟(LYue/ۥۡۤ۠ۥ;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)LYue/ۥۡۢۦ$ۥ۟۟۠;
    .locals 7
    .param p0    # LYue/ۥۡۤ۠ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v6, LYue/ۥۡۢۦ$ۥ۟۟۠;

    const-string v0, "declineIntent is required"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "answerIntent is required"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v1, 0x1

    const/4 v3, 0x0

    move-object v0, v6

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LYue/ۥۡۢۦ$ۥ۟۟۠;-><init>(ILYue/ۥۡۤ۠ۥ;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V

    return-object v6
.end method

.method public static ۥ۟۟ۡ۠(LYue/ۥۡۤ۠ۥ;Landroid/app/PendingIntent;)LYue/ۥۡۢۦ$ۥ۟۟۠;
    .locals 7
    .param p0    # LYue/ۥۡۤ۠ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v6, LYue/ۥۡۢۦ$ۥ۟۟۠;

    const-string v0, "hangUpIntent is required"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x2

    move-object v0, v6

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, LYue/ۥۡۢۦ$ۥ۟۟۠;-><init>(ILYue/ۥۡۤ۠ۥ;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V

    return-object v6
.end method

.method public static ۥ۟۟ۡۡ(LYue/ۥۡۤ۠ۥ;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)LYue/ۥۡۢۦ$ۥ۟۟۠;
    .locals 7
    .param p0    # LYue/ۥۡۤ۠ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v6, LYue/ۥۡۢۦ$ۥ۟۟۠;

    const-string v0, "hangUpIntent is required"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "answerIntent is required"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v1, 0x3

    const/4 v4, 0x0

    move-object v0, v6

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LYue/ۥۡۢۦ$ۥ۟۟۠;-><init>(ILYue/ۥۡۤ۠ۥ;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V

    return-object v6
.end method


# virtual methods
.method public ۥ(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ(Landroid/os/Bundle;)V

    const-string v0, "android.callType"

    iget v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟۟:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "android.callIsVideo"

    iget-boolean v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۤ:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟۠:LYue/ۥۡۤ۠ۥ;

    if-eqz v0, :cond_1

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_0

    invoke-virtual {v0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۥ()Landroid/app/Person;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟۟۟;->ۥ۟(Landroid/app/Person;)Landroid/os/Parcelable;

    move-result-object v0

    const-string v1, "android.callPerson"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_0

    :cond_0
    const-string v1, "android.callPersonCompat"

    invoke-virtual {v0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۧ()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_1
    :goto_0
    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۧ:Landroidx/core/graphics/drawable/IconCompat;

    if-eqz v0, :cond_2

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object v1, v1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟ۡۥ(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟;->ۥ(Landroid/graphics/drawable/Icon;)Landroid/os/Parcelable;

    move-result-object v0

    const-string v1, "android.verificationIcon"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_2
    const-string v0, "android.verificationText"

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۨ:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    const-string v0, "android.answerIntent"

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۡ:Landroid/app/PendingIntent;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "android.declineIntent"

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۢ:Landroid/app/PendingIntent;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "android.hangUpIntent"

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥۣ۟۟۟:Landroid/app/PendingIntent;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۥ:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    const-string v1, "android.answerColor"

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_3
    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۦ:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    const-string v1, "android.declineColor"

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_4
    return-void
.end method

.method public ۥ۟(LYue/ۥۡۢۥۥ;)V
    .locals 4
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    const/4 v2, 0x0

    if-lt v0, v1, :cond_7

    iget v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟۟:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const-string v0, "NotifCompat"

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unrecognized call type in CallStyle: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟۟:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟۠:LYue/ۥۡۤ۠ۥ;

    invoke-virtual {v0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۥ()Landroid/app/Person;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥۣ۟۟۟:Landroid/app/PendingIntent;

    iget-object v2, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۡ:Landroid/app/PendingIntent;

    invoke-static {v0, v1, v2}, LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟۟۠;->ۥ۟۟(Landroid/app/Person;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Landroid/app/Notification$CallStyle;

    move-result-object v2

    goto :goto_0

    :cond_1
    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟۠:LYue/ۥۡۤ۠ۥ;

    invoke-virtual {v0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۥ()Landroid/app/Person;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥۣ۟۟۟:Landroid/app/PendingIntent;

    invoke-static {v0, v1}, LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟۟۠;->ۥ۟(Landroid/app/Person;Landroid/app/PendingIntent;)Landroid/app/Notification$CallStyle;

    move-result-object v2

    goto :goto_0

    :cond_2
    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟۠:LYue/ۥۡۤ۠ۥ;

    invoke-virtual {v0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۥ()Landroid/app/Person;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۢ:Landroid/app/PendingIntent;

    iget-object v2, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۡ:Landroid/app/PendingIntent;

    invoke-static {v0, v1, v2}, LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟۟۠;->ۥ(Landroid/app/Person;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Landroid/app/Notification$CallStyle;

    move-result-object v2

    :cond_3
    :goto_0
    if-eqz v2, :cond_e

    invoke-interface {p1}, LYue/ۥۡۢۥۥ;->ۥ()Landroid/app/Notification$Builder;

    move-result-object p1

    invoke-static {v2, p1}, LYue/ۥۡۢۦ۟;->ۥ(Landroid/app/Notification$CallStyle;Landroid/app/Notification$Builder;)V

    iget-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۥ:Ljava/lang/Integer;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v2, p1}, LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟۟۠;->ۥ۟۟۟(Landroid/app/Notification$CallStyle;I)Landroid/app/Notification$CallStyle;

    :cond_4
    iget-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۦ:Ljava/lang/Integer;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v2, p1}, LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟۟۠;->ۥ۟۟۟۠(Landroid/app/Notification$CallStyle;I)Landroid/app/Notification$CallStyle;

    :cond_5
    iget-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۨ:Ljava/lang/CharSequence;

    invoke-static {v2, p1}, LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟۟۠;->ۥۣ۟۟۟(Landroid/app/Notification$CallStyle;Ljava/lang/CharSequence;)Landroid/app/Notification$CallStyle;

    iget-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۧ:Landroidx/core/graphics/drawable/IconCompat;

    if-eqz p1, :cond_6

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object v0, v0, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ:Landroid/content/Context;

    invoke-virtual {p1, v0}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟ۡۥ(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    invoke-static {v2, p1}, LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟۟۠;->ۥ۟۟۟ۢ(Landroid/app/Notification$CallStyle;Landroid/graphics/drawable/Icon;)Landroid/app/Notification$CallStyle;

    :cond_6
    iget-boolean p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۤ:Z

    invoke-static {v2, p1}, LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟۟۠;->ۥ۟۟۟ۡ(Landroid/app/Notification$CallStyle;Z)Landroid/app/Notification$CallStyle;

    goto :goto_3

    :cond_7
    invoke-interface {p1}, LYue/ۥۡۢۥۥ;->ۥ()Landroid/app/Notification$Builder;

    move-result-object p1

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟۠:LYue/ۥۡۤ۠ۥ;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟۠()Ljava/lang/CharSequence;

    move-result-object v1

    goto :goto_1

    :cond_8
    move-object v1, v2

    :goto_1
    invoke-virtual {p1, v1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object v1, v1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥۣ۟۟ۡ:Landroid/os/Bundle;

    if-eqz v1, :cond_9

    const-string v3, "android.text"

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object v1, v1, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥۣ۟۟ۡ:Landroid/os/Bundle;

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    :cond_9
    if-nez v2, :cond_a

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥۣ۟۟ۡ()Ljava/lang/String;

    move-result-object v2

    :cond_a
    invoke-virtual {p1, v2}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟۠:LYue/ۥۡۤ۠ۥ;

    if-eqz v1, :cond_d

    invoke-virtual {v1}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    if-eqz v1, :cond_b

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟۠:LYue/ۥۡۤ۠ۥ;

    invoke-virtual {v1}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    iget-object v2, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object v2, v2, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ:Landroid/content/Context;

    invoke-virtual {v1, v2}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟ۡۥ(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v1

    invoke-static {p1, v1}, LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟;->ۥ۟۟(Landroid/app/Notification$Builder;Landroid/graphics/drawable/Icon;)V

    :cond_b
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_c

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟۠:LYue/ۥۡۤ۠ۥ;

    invoke-virtual {v0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۥ()Landroid/app/Person;

    move-result-object v0

    invoke-static {p1, v0}, LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟۟۟۟;->ۥ(Landroid/app/Notification$Builder;Landroid/app/Person;)Landroid/app/Notification$Builder;

    goto :goto_2

    :cond_c
    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟۠:LYue/ۥۡۤ۠ۥ;

    invoke-virtual {v0}, LYue/ۥۡۤ۠ۥ;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟;->ۥ(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    :cond_d
    :goto_2
    const-string v0, "call"

    invoke-static {p1, v0}, LYue/ۥۡۢۦ$ۥ۟۟۠$ۥ۟;->ۥ۟(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    :cond_e
    :goto_3
    return-void
.end method

.method public ۥ۟۟۠ۡ()Z
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const/4 v0, 0x1

    return v0
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

    const-string v0, "androidx.core.app.NotificationCompat$CallStyle"

    return-object v0
.end method

.method public ۥ۟۟۠ۨ(Landroid/os/Bundle;)V
    .locals 3
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

    const-string v0, "android.callType"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟۟:I

    const-string v0, "android.callIsVideo"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۤ:Z

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const-string v0, "android.callPerson"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۢۥۨ;->ۥ(Ljava/lang/Object;)Landroid/app/Person;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۤ۠ۥ;->ۥ(Landroid/app/Person;)LYue/ۥۡۤ۠ۥ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟۠:LYue/ۥۡۤ۠ۥ;

    goto :goto_0

    :cond_0
    const-string v0, "android.callPersonCompat"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۤ۠ۥ;->ۥ۟(Landroid/os/Bundle;)LYue/ۥۡۤ۠ۥ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟۠:LYue/ۥۡۤ۠ۥ;

    :cond_1
    :goto_0
    const-string v0, "android.verificationIcon"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Icon;

    invoke-static {v0}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۟ۡ(Landroid/graphics/drawable/Icon;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۧ:Landroidx/core/graphics/drawable/IconCompat;

    goto :goto_1

    :cond_2
    const-string v0, "android.verificationIconCompat"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۟۟(Landroid/os/Bundle;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۧ:Landroidx/core/graphics/drawable/IconCompat;

    :cond_3
    :goto_1
    const-string v0, "android.verificationText"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۨ:Ljava/lang/CharSequence;

    const-string v0, "android.answerIntent"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۡ:Landroid/app/PendingIntent;

    const-string v0, "android.declineIntent"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۢ:Landroid/app/PendingIntent;

    const-string v0, "android.hangUpIntent"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥۣ۟۟۟:Landroid/app/PendingIntent;

    const-string v0, "android.answerColor"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_2

    :cond_4
    move-object v0, v2

    :goto_2
    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۥ:Ljava/lang/Integer;

    const-string v0, "android.declineColor"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_5
    iput-object v2, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۦ:Ljava/lang/Integer;

    return-void
.end method

.method public ۥ۟۟ۡۢ()Ljava/util/ArrayList;
    .locals 7
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x14
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06e1\u06e2\u06e6$\u06e5\u06df;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟ۡۧ()LYue/ۥۡۢۦ$ۥ۟;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟ۡۦ()LYue/ۥۡۢۦ$ۥ۟;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object v0, v0, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ۟:Ljava/util/ArrayList;

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LYue/ۥۡۢۦ$ۥ۟;

    invoke-virtual {v5}, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟ۦ()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v5}, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟ۡۤ(LYue/ۥۡۢۦ$ۥ۟;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    if-le v4, v3, :cond_3

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, -0x1

    :cond_3
    :goto_1
    if-eqz v1, :cond_0

    if-ne v4, v3, :cond_0

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_4
    if-eqz v1, :cond_5

    if-lt v4, v3, :cond_5

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    return-object v2
.end method

.method public final ۥۣ۟۟ۡ()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟۟:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object v0, v0, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LYue/ۥۡۥۨۡ$ۥ۟۟۟ۢ;->ۥ۟۟۟ۡ:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object v0, v0, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LYue/ۥۡۥۨۡ$ۥ۟۟۟ۢ;->ۥ۟۟۟۠:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object v0, v0, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LYue/ۥۡۥۨۡ$ۥ۟۟۟ۢ;->ۥ۟۟۟۟:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟ۡۤ(LYue/ۥۡۢۦ$ۥ۟;)Z
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "key_action_priority"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final ۥ۟۟ۡۥ(IILjava/lang/Integer;ILandroid/app/PendingIntent;)LYue/ۥۡۢۦ$ۥ۟;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x14
    .end annotation

    if-nez p3, :cond_0

    iget-object p3, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object p3, p3, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ:Landroid/content/Context;

    invoke-static {p3, p4}, LYue/ۥۣ۟ۧۨ;->ۥ۟۟۟ۡ(Landroid/content/Context;I)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    :cond_0
    new-instance p4, Landroid/text/SpannableStringBuilder;

    invoke-direct {p4}, Landroid/text/SpannableStringBuilder;-><init>()V

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object v0, v0, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    new-instance p2, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-direct {p2, p3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result p3

    const/16 v0, 0x12

    const/4 v1, 0x0

    invoke-virtual {p4, p2, v1, p3, v0}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    new-instance p2, LYue/ۥۡۢۦ$ۥ۟$ۥ;

    iget-object p3, p0, LYue/ۥۡۢۦ$ۥ۟۟۠ۨ;->ۥ:LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;

    iget-object p3, p3, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥ:Landroid/content/Context;

    invoke-static {p3, p1}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۠۠(Landroid/content/Context;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    invoke-direct {p2, p1, p4, p5}, LYue/ۥۡۢۦ$ۥ۟$ۥ;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {p2}, LYue/ۥۡۢۦ$ۥ۟$ۥ;->ۥ۟۟()LYue/ۥۡۢۦ$ۥ۟;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟()Landroid/os/Bundle;

    move-result-object p2

    const-string p3, "key_action_priority"

    const/4 p4, 0x1

    invoke-virtual {p2, p3, p4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-object p1
.end method

.method public final ۥ۟۟ۡۦ()LYue/ۥۡۢۦ$ۥ۟;
    .locals 8
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x14
    .end annotation

    sget v0, LYue/ۥۡۥۨۡ$ۥ۟۟۟;->ۥ۟۟:I

    sget v1, LYue/ۥۡۥۨۡ$ۥ۟۟۟;->ۥ:I

    iget-object v7, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۡ:Landroid/app/PendingIntent;

    if-nez v7, :cond_0

    const/4 v0, 0x0

    goto :goto_3

    :cond_0
    iget-boolean v2, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۤ:Z

    if-eqz v2, :cond_1

    move v3, v0

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    if-eqz v2, :cond_2

    sget v0, LYue/ۥۡۥۨۡ$ۥ۟۟۟ۢ;->ۥ۟:I

    :goto_1
    move v4, v0

    goto :goto_2

    :cond_2
    sget v0, LYue/ۥۡۥۨۡ$ۥ۟۟۟ۢ;->ۥ:I

    goto :goto_1

    :goto_2
    iget-object v5, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۥ:Ljava/lang/Integer;

    sget v6, LYue/ۥۡۥۨۡ$ۥ۟;->ۥ۟۟:I

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟ۡۥ(IILjava/lang/Integer;ILandroid/app/PendingIntent;)LYue/ۥۡۢۦ$ۥ۟;

    move-result-object v0

    :goto_3
    return-object v0
.end method

.method public final ۥ۟۟ۡۧ()LYue/ۥۡۢۦ$ۥ۟;
    .locals 6
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x14
    .end annotation

    sget v1, LYue/ۥۡۥۨۡ$ۥ۟۟۟;->ۥ۟۟۟۟:I

    iget-object v5, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۢ:Landroid/app/PendingIntent;

    if-nez v5, :cond_0

    sget v2, LYue/ۥۡۥۨۡ$ۥ۟۟۟ۢ;->ۥ۟۟۟:I

    iget-object v3, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۦ:Ljava/lang/Integer;

    sget v4, LYue/ۥۡۥۨۡ$ۥ۟;->ۥ۟۟۟:I

    iget-object v5, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥۣ۟۟۟:Landroid/app/PendingIntent;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟ۡۥ(IILjava/lang/Integer;ILandroid/app/PendingIntent;)LYue/ۥۡۢۦ$ۥ۟;

    move-result-object v0

    return-object v0

    :cond_0
    sget v2, LYue/ۥۡۥۨۡ$ۥ۟۟۟ۢ;->ۥ۟۟:I

    iget-object v3, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۦ:Ljava/lang/Integer;

    sget v4, LYue/ۥۡۥۨۡ$ۥ۟;->ۥ۟۟۟:I

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟ۡۥ(IILjava/lang/Integer;ILandroid/app/PendingIntent;)LYue/ۥۡۢۦ$ۥ۟;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۡۨ(I)LYue/ۥۡۢۦ$ۥ۟۟۠;
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۥ:Ljava/lang/Integer;

    return-object p0
.end method

.method public ۥ۟۟ۢ(I)LYue/ۥۡۢۦ$ۥ۟۟۠;
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۦ:Ljava/lang/Integer;

    return-object p0
.end method

.method public ۥ۟۟ۢ۟(Z)LYue/ۥۡۢۦ$ۥ۟۟۠;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-boolean p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۤ:Z

    return-object p0
.end method

.method public ۥ۟۟ۢ۠(Landroid/graphics/Bitmap;)LYue/ۥۡۢۦ$ۥ۟۟۠;
    .locals 0
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {p1}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۟ۧ(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۧ:Landroidx/core/graphics/drawable/IconCompat;

    return-object p0
.end method

.method public ۥ۟۟ۢۡ(Landroid/graphics/drawable/Icon;)LYue/ۥۡۢۦ$ۥ۟۟۠;
    .locals 0
    .param p1    # Landroid/graphics/drawable/Icon;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x17
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroidx/core/graphics/drawable/IconCompat;->ۥ۟۟۟ۡ(Landroid/graphics/drawable/Icon;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۧ:Landroidx/core/graphics/drawable/IconCompat;

    return-object p0
.end method

.method public ۥ۟۟ۢۢ(Ljava/lang/CharSequence;)LYue/ۥۡۢۦ$ۥ۟۟۠;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠;->ۥ۟۟۟ۨ:Ljava/lang/CharSequence;

    return-object p0
.end method
