.class public LYue/ۥۣۡۧۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ۟۟:LYue/ۥۣۡۧۥ;

.field public static final ۥ۟۟۟:LYue/ۥۣۡۧۥ;


# instance fields
.field public final ۥ:Z

.field public final ۥ۟:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۣۡۧۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, LYue/ۥۣۡۧۥ;-><init>(ZZ)V

    sput-object v0, LYue/ۥۣۡۧۥ;->ۥ۟۟:LYue/ۥۣۡۧۥ;

    new-instance v0, LYue/ۥۣۡۧۥ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v1}, LYue/ۥۣۡۧۥ;-><init>(ZZ)V

    sput-object v0, LYue/ۥۣۡۧۥ;->ۥ۟۟۟:LYue/ۥۣۡۧۥ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۡۧۥ;)V
    .locals 1

    .line 4
    iget-boolean v0, p1, LYue/ۥۣۡۧۥ;->ۥ:Z

    iget-boolean p1, p1, LYue/ۥۣۡۧۥ;->ۥ۟:Z

    invoke-direct {p0, v0, p1}, LYue/ۥۣۡۧۥ;-><init>(ZZ)V

    return-void
.end method

.method public constructor <init>(ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, LYue/ۥۣۡۧۥ;->ۥ:Z

    .line 3
    iput-boolean p2, p0, LYue/ۥۣۡۧۥ;->ۥ۟:Z

    return-void
.end method

.method public static ۥ(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۢۤۨ;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ۥ۟(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iget-boolean v0, p0, LYue/ۥۣۡۧۥ;->ۥ۟:Z

    if-nez v0, :cond_0

    invoke-static {p1}, LYue/ۥۡۢۤۨ;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public ۥ۟۟(LYue/ۥ۟ۢ۠ۤ;)LYue/ۥ۟ۢ۠ۤ;
    .locals 1

    if-eqz p1, :cond_0

    iget-boolean v0, p0, LYue/ۥۣۡۧۥ;->ۥ۟:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟ۡۧ()V

    :cond_0
    return-object p1
.end method

.method public ۥ۟۟۟(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iget-boolean v0, p0, LYue/ۥۣۡۧۥ;->ۥ:Z

    if-nez v0, :cond_0

    invoke-static {p1}, LYue/ۥۡۢۤۨ;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public ۥ۟۟۟۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣۡۧۥ;->ۥ۟:Z

    return v0
.end method

.method public ۥ۟۟۟۠()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣۡۧۥ;->ۥ:Z

    return v0
.end method
