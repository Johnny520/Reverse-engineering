.class public final LYue/ۥۡۢۦ$ۥ۟۟۠۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۢۦ$ۥ۟۟۠ۡ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06e0\u06df"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;,
        LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ;,
        LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟:Ljava/lang/String; = "android.car.EXTENSIONS"
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation
.end field

.field public static final ۥ۟۟۟۟:Ljava/lang/String; = "large_icon"

.field public static final ۥ۟۟۟۠:Ljava/lang/String; = "car_conversation"

.field public static final ۥ۟۟۟ۡ:Ljava/lang/String; = "app_color"

.field public static final ۥ۟۟۟ۢ:Ljava/lang/String; = "invisible_actions"
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation
.end field

.field public static final ۥۣ۟۟۟:Ljava/lang/String; = "author"

.field public static final ۥ۟۟۟ۤ:Ljava/lang/String; = "text"

.field public static final ۥ۟۟۟ۥ:Ljava/lang/String; = "messages"

.field public static final ۥ۟۟۟ۦ:Ljava/lang/String; = "remote_input"

.field public static final ۥ۟۟۟ۧ:Ljava/lang/String; = "on_reply"

.field public static final ۥ۟۟۟ۨ:Ljava/lang/String; = "on_read"

.field public static final ۥ۟۟۠:Ljava/lang/String; = "participants"

.field public static final ۥ۟۟۠۟:Ljava/lang/String; = "timestamp"


# instance fields
.field public ۥ:Landroid/graphics/Bitmap;

.field public ۥ۟:LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;

.field public ۥ۟۟:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟;->ۥ۟۟:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Notification;)V
    .locals 2
    .param p1    # Landroid/app/Notification;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟;->ۥ۟۟:I

    .line 5
    invoke-static {p1}, LYue/ۥۡۢۦ;->ۥ۟۟۟ۨ(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p1}, LYue/ۥۡۢۦ;->ۥ۟۟۟ۨ(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object p1

    const-string v1, "android.car.EXTENSIONS"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    .line 7
    const-string v1, "large_icon"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    iput-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟;->ۥ:Landroid/graphics/Bitmap;

    .line 8
    const-string v1, "app_color"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟;->ۥ۟۟:I

    .line 9
    const-string v0, "car_conversation"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    .line 10
    invoke-static {p1}, LYue/ۥۡۢۦ$ۥ۟۟۠۟;->ۥ۟۟۟۠(Landroid/os/Bundle;)LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟;->ۥ۟:LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;

    :cond_1
    return-void
.end method

.method public static ۥ۟(LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;)Landroid/os/Bundle;
    .locals 8
    .param p0    # LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x15
    .end annotation

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;->ۥ۟۟۟()[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;->ۥ۟۟۟()[Ljava/lang/String;

    move-result-object v1

    array-length v1, v1

    const/4 v3, 0x1

    if-le v1, v3, :cond_0

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;->ۥ۟۟۟()[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;->ۥ۟()[Ljava/lang/String;

    move-result-object v3

    array-length v3, v3

    new-array v4, v3, [Landroid/os/Parcelable;

    :goto_1
    if-ge v2, v3, :cond_1

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;->ۥ۟()[Ljava/lang/String;

    move-result-object v6

    aget-object v6, v6, v2

    const-string v7, "text"

    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "author"

    invoke-virtual {v5, v6, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v5, v4, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    const-string v1, "messages"

    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;->ۥ۟۟۟۠()LYue/ۥۡۦۣۨ;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LYue/ۥۡۦۣۨ;->ۥ۟۟۠()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ;->ۥ۟۟۟(Ljava/lang/String;)Landroid/app/RemoteInput$Builder;

    move-result-object v2

    invoke-virtual {v1}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟ۨ()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-static {v2, v3}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ;->ۥ۟۟۟ۦ(Landroid/app/RemoteInput$Builder;Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;

    invoke-virtual {v1}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟ۢ()[Ljava/lang/CharSequence;

    move-result-object v3

    invoke-static {v2, v3}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ;->ۥ۟۟۟ۥ(Landroid/app/RemoteInput$Builder;[Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;

    invoke-virtual {v1}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟۠()Z

    move-result v3

    invoke-static {v2, v3}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ;->ۥ۟۟۟ۤ(Landroid/app/RemoteInput$Builder;Z)Landroid/app/RemoteInput$Builder;

    invoke-virtual {v1}, LYue/ۥۡۦۣۨ;->ۥ۟۟۟ۧ()Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v2, v1}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ;->ۥ(Landroid/app/RemoteInput$Builder;Landroid/os/Bundle;)Landroid/app/RemoteInput$Builder;

    invoke-static {v2}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ;->ۥ۟(Landroid/app/RemoteInput$Builder;)Landroid/app/RemoteInput;

    move-result-object v1

    const-string v2, "remote_input"

    invoke-static {v1}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ;->ۥ۟۟(Landroid/app/RemoteInput;)Landroid/os/Parcelable;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_2
    const-string v1, "on_reply"

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;->ۥ۟۟۟ۡ()Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "on_read"

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;->ۥ۟۟۟۟()Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "participants"

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;->ۥ۟۟۟()[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "timestamp"

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;->ۥ()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    return-object v0
.end method

.method public static ۥ۟۟۟۠(Landroid/os/Bundle;)LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;
    .locals 21
    .param p0    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x15
    .end annotation

    move-object/from16 v0, p0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const-string v2, "messages"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    array-length v4, v2

    new-array v5, v4, [Ljava/lang/String;

    move v6, v3

    :goto_0
    if-ge v6, v4, :cond_3

    aget-object v7, v2, v6

    instance-of v8, v7, Landroid/os/Bundle;

    if-nez v8, :cond_1

    goto :goto_1

    :cond_1
    check-cast v7, Landroid/os/Bundle;

    const-string v8, "text"

    invoke-virtual {v7, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    if-nez v7, :cond_2

    :goto_1
    return-object v1

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    move-object v8, v5

    goto :goto_2

    :cond_4
    move-object v8, v1

    :goto_2
    const-string v2, "on_read"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/app/PendingIntent;

    const-string v2, "on_reply"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroid/app/PendingIntent;

    const-string v2, "remote_input"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/app/RemoteInput;

    const-string v4, "participants"

    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_8

    array-length v4, v12

    const/4 v5, 0x1

    if-eq v4, v5, :cond_5

    goto :goto_3

    :cond_5
    if-eqz v2, :cond_7

    new-instance v1, LYue/ۥۡۦۣۨ;

    invoke-static {v2}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ;->ۥۣ۟۟۟(Landroid/app/RemoteInput;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v2}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ;->ۥ۟۟۟ۢ(Landroid/app/RemoteInput;)Ljava/lang/CharSequence;

    move-result-object v15

    invoke-static {v2}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ;->ۥ۟۟۟۠(Landroid/app/RemoteInput;)[Ljava/lang/CharSequence;

    move-result-object v16

    invoke-static {v2}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ;->ۥ۟۟۟۟(Landroid/app/RemoteInput;)Z

    move-result v17

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1d

    if-lt v4, v5, :cond_6

    invoke-static {v2}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟;->ۥ(Landroid/app/RemoteInput;)I

    move-result v3

    :cond_6
    move/from16 v18, v3

    invoke-static {v2}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ;->ۥ۟۟۟ۡ(Landroid/app/RemoteInput;)Landroid/os/Bundle;

    move-result-object v19

    const/16 v20, 0x0

    move-object v13, v1

    invoke-direct/range {v13 .. v20}, LYue/ۥۡۦۣۨ;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZILandroid/os/Bundle;Ljava/util/Set;)V

    :cond_7
    move-object v9, v1

    new-instance v1, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;

    const-string v2, "timestamp"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v13

    move-object v7, v1

    invoke-direct/range {v7 .. v14}, LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;-><init>([Ljava/lang/String;LYue/ۥۡۦۣۨ;Landroid/app/PendingIntent;Landroid/app/PendingIntent;[Ljava/lang/String;J)V

    :cond_8
    :goto_3
    return-object v1
.end method


# virtual methods
.method public ۥ(LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;)LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;
    .locals 3
    .param p1    # LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟;->ۥ:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_0

    const-string v2, "large_icon"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    iget v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟;->ۥ۟۟:I

    if-eqz v1, :cond_1

    const-string v2, "app_color"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟;->ۥ۟:LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;

    if-eqz v1, :cond_2

    invoke-static {v1}, LYue/ۥۡۢۦ$ۥ۟۟۠۟;->ۥ۟(LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;)Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "car_conversation"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟۟۟ۨ;->ۥۣ۟۟۠()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "android.car.EXTENSIONS"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    return-object p1
.end method

.method public ۥ۟۟()I
    .locals 1
    .annotation build LYue/ۥ۟ۥۢۧ;
    .end annotation

    iget v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟;->ۥ۟۟:I

    return v0
.end method

.method public ۥ۟۟۟()Landroid/graphics/Bitmap;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟;->ۥ:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public ۥ۟۟۟۟()LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟;->ۥ۟:LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;

    return-object v0
.end method

.method public ۥ۟۟۟ۡ(I)LYue/ۥۡۢۦ$ۥ۟۟۠۟;
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟;->ۥ۟۟:I

    return-object p0
.end method

.method public ۥ۟۟۟ۢ(Landroid/graphics/Bitmap;)LYue/ۥۡۢۦ$ۥ۟۟۠۟;
    .locals 0
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟;->ۥ:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public ۥۣ۟۟۟(LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;)LYue/ۥۡۢۦ$ۥ۟۟۠۟;
    .locals 0
    .param p1    # LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۠۟;->ۥ۟:LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ۟۟;

    return-object p0
.end method
