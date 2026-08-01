.class public final synthetic Lmy0;
.super Lp80;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:Landroid/app/Activity;

.field public final synthetic ζ:Lf8;

.field public final synthetic η:Lfv;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lf8;Lfv;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lmy0;->ε:Landroid/app/Activity;

    .line 2
    .line 3
    iput-object p2, p0, Lmy0;->ζ:Lf8;

    .line 4
    .line 5
    iput-object p3, p0, Lmy0;->η:Lfv;

    .line 6
    .line 7
    const-string v4, "downloadVideo$startDownload(Landroid/app/Activity;Lcom/example/dyhelper/model/AwemeInfo;Lcom/example/dyhelper/download/DownloadPathTemplateResolver$ResolvedPath;Ljava/lang/String;)V"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v1, 0x1

    .line 11
    const-class v2, Lkn0;

    .line 12
    .line 13
    const-string v3, "startDownload"

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    invoke-direct/range {v0 .. v5}, Lp80;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmy0;->ζ:Lf8;

    .line 7
    .line 8
    iget-object v1, p0, Lmy0;->η:Lfv;

    .line 9
    .line 10
    iget-object p0, p0, Lmy0;->ε:Landroid/app/Activity;

    .line 11
    .line 12
    invoke-static {p0, v0, v1, p1}, Lqy0;->Ρ(Landroid/app/Activity;Lf8;Lfv;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Ls62;->α:Ls62;

    .line 16
    .line 17
    return-object p0
.end method
