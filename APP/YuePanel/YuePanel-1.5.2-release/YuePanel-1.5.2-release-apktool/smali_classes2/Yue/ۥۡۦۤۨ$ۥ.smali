.class public LYue/ۥۡۦۤۨ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۤۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Ljava/net/URL;

.field public final ۥ۟:Ljava/net/Authenticator$RequestorType;

.field public final ۥ۟۟:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/net/URL;Ljava/net/Authenticator$RequestorType;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۦۤۨ$ۥ;->ۥ:Ljava/net/URL;

    iput-object p2, p0, LYue/ۥۡۦۤۨ$ۥ;->ۥ۟:Ljava/net/Authenticator$RequestorType;

    iput-object p3, p0, LYue/ۥۡۦۤۨ$ۥ;->ۥ۟۟:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public ۥ(Ljava/lang/String;Ljava/lang/String;)Ljava/net/PasswordAuthentication;
    .locals 1

    new-instance v0, Ljava/net/PasswordAuthentication;

    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object p2

    invoke-direct {v0, p1, p2}, Ljava/net/PasswordAuthentication;-><init>(Ljava/lang/String;[C)V

    return-object v0
.end method

.method public ۥ۟()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۡۦۤۨ$ۥ;->ۥ۟:Ljava/net/Authenticator$RequestorType;

    sget-object v1, Ljava/net/Authenticator$RequestorType;->PROXY:Ljava/net/Authenticator$RequestorType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۡۦۤۨ$ۥ;->ۥ۟:Ljava/net/Authenticator$RequestorType;

    sget-object v1, Ljava/net/Authenticator$RequestorType;->SERVER:Ljava/net/Authenticator$RequestorType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۦۤۨ$ۥ;->ۥ۟۟:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟۟()Ljava/net/Authenticator$RequestorType;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۦۤۨ$ۥ;->ۥ۟:Ljava/net/Authenticator$RequestorType;

    return-object v0
.end method

.method public ۥ۟۟۟۠()Ljava/net/URL;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۦۤۨ$ۥ;->ۥ:Ljava/net/URL;

    return-object v0
.end method
