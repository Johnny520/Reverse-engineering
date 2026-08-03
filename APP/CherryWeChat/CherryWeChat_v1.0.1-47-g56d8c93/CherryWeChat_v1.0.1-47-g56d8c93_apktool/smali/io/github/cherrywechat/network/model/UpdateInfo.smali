.class public final Lio/github/cherrywechat/network/model/UpdateInfo;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/UpdateInfo$$serializer;,
        Lio/github/cherrywechat/network/model/UpdateInfo$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lio/github/cherrywechat/network/model/UpdateInfo$Companion;


# instance fields
.field private final downloadUrl:Ljava/lang/String;

.field private final forceUpdate:Z

.field private final hasUpdate:Z

.field private final releaseNotes:Ljava/lang/String;

.field private final versionCode:I

.field private final versionName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/cherrywechat/network/model/UpdateInfo$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/UpdateInfo$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/UpdateInfo;->Companion:Lio/github/cherrywechat/network/model/UpdateInfo$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lio/github/cherrywechat/network/model/UpdateInfo;-><init>(ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(IZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLGx;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p8, p1, 0x1

    const/4 v0, 0x0

    if-nez p8, :cond_0

    iput-boolean v0, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->hasUpdate:Z

    goto :goto_0

    :cond_0
    iput-boolean p2, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->hasUpdate:Z

    :goto_0
    and-int/lit8 p2, p1, 0x2

    const-string p8, ""

    if-nez p2, :cond_1

    iput-object p8, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionName:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionName:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput v0, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionCode:I

    goto :goto_2

    :cond_2
    iput p4, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionCode:I

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p8, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->releaseNotes:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->releaseNotes:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p8, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->downloadUrl:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->downloadUrl:Ljava/lang/String;

    :goto_4
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_5

    iput-boolean v0, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->forceUpdate:Z

    return-void

    :cond_5
    iput-boolean p7, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->forceUpdate:Z

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-boolean p1, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->hasUpdate:Z

    .line 5
    iput-object p2, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionName:Ljava/lang/String;

    .line 6
    iput p3, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionCode:I

    .line 7
    iput-object p4, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->releaseNotes:Ljava/lang/String;

    .line 8
    iput-object p5, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->downloadUrl:Ljava/lang/String;

    .line 9
    iput-boolean p6, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->forceUpdate:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILOc;)V
    .locals 2

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    .line 10
    const-string v1, ""

    if-eqz p8, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move-object p4, v1

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    move-object p5, v1

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    move p7, v0

    :goto_0
    move-object p6, p5

    move-object p5, p4

    move p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move p7, p6

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p7}, Lio/github/cherrywechat/network/model/UpdateInfo;-><init>(ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/UpdateInfo;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lio/github/cherrywechat/network/model/UpdateInfo;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-boolean p1, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->hasUpdate:Z

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p3, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionCode:I

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->releaseNotes:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->downloadUrl:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->forceUpdate:Z

    :cond_5
    move-object p7, p5

    move p8, p6

    move p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/github/cherrywechat/network/model/UpdateInfo;->copy(ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)Lio/github/cherrywechat/network/model/UpdateInfo;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/UpdateInfo;LWa;LCx;)V
    .locals 1

    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean p2, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->hasUpdate:Z

    if-eqz p2, :cond_1

    :goto_0
    iget-boolean p2, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->hasUpdate:Z

    invoke-interface {p1}, LWa;->b()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    const-string v0, ""

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionName:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    :goto_1
    iget-object p2, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionName:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_3
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    iget p2, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionCode:I

    if-eqz p2, :cond_5

    :goto_2
    iget p2, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionCode:I

    invoke-interface {p1}, LWa;->e()V

    :cond_5
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_3

    :cond_6
    iget-object p2, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->releaseNotes:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    :goto_3
    iget-object p2, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->releaseNotes:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_7
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_4

    :cond_8
    iget-object p2, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->downloadUrl:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    :goto_4
    iget-object p2, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->downloadUrl:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_9
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_a

    goto :goto_5

    :cond_a
    iget-boolean p2, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->forceUpdate:Z

    if-eqz p2, :cond_b

    :goto_5
    iget-boolean p0, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->forceUpdate:Z

    invoke-interface {p1}, LWa;->b()V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->hasUpdate:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionCode:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->releaseNotes:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->downloadUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->forceUpdate:Z

    return v0
.end method

.method public final copy(ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)Lio/github/cherrywechat/network/model/UpdateInfo;
    .locals 7

    new-instance v0, Lio/github/cherrywechat/network/model/UpdateInfo;

    move v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lio/github/cherrywechat/network/model/UpdateInfo;-><init>(ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/UpdateInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/UpdateInfo;

    iget-boolean v1, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->hasUpdate:Z

    iget-boolean v3, p1, Lio/github/cherrywechat/network/model/UpdateInfo;->hasUpdate:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionName:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/UpdateInfo;->versionName:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionCode:I

    iget v3, p1, Lio/github/cherrywechat/network/model/UpdateInfo;->versionCode:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->releaseNotes:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/UpdateInfo;->releaseNotes:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->downloadUrl:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/UpdateInfo;->downloadUrl:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->forceUpdate:Z

    iget-boolean p1, p1, Lio/github/cherrywechat/network/model/UpdateInfo;->forceUpdate:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getDownloadUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->downloadUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getForceUpdate()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->forceUpdate:Z

    return v0
.end method

.method public final getHasUpdate()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->hasUpdate:Z

    return v0
.end method

.method public final getReleaseNotes()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->releaseNotes:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersionCode()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionCode:I

    return v0
.end method

.method public final getVersionName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->hasUpdate:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionName:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget v2, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionCode:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->releaseNotes:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->downloadUrl:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-boolean v1, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->forceUpdate:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UpdateInfo(hasUpdate="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->hasUpdate:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", versionName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", versionCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->versionCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", releaseNotes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->releaseNotes:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", downloadUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->downloadUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", forceUpdate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/github/cherrywechat/network/model/UpdateInfo;->forceUpdate:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
