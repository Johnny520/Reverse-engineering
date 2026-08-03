.class public final enum LYue/ۥۡۥۣۧ;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۥۣۧ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LYue/\u06e5\u06e1\u06e5\u06e3\u06e7;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۤ:LYue/ۥۡۥۣۧ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final enum ۥ۟۟۠ۥ:LYue/ۥۡۥۣۧ;

.field public static final enum ۥ۟۟۠ۦ:LYue/ۥۡۥۣۧ;

.field public static final enum ۥ۟۟۠ۧ:LYue/ۥۡۥۣۧ;
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "OkHttp has dropped support for SPDY. Prefer {@link #HTTP_2}."
    .end annotation
.end field

.field public static final enum ۥ۟۟۠ۨ:LYue/ۥۡۥۣۧ;

.field public static final enum ۥ۟۟ۡ:LYue/ۥۡۥۣۧ;

.field public static final enum ۥ۟۟ۡ۟:LYue/ۥۡۥۣۧ;

.field public static final synthetic ۥ۟۟ۡ۠:[LYue/ۥۡۥۣۧ;


# instance fields
.field public final ۥۣ۟۟۠:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LYue/ۥۡۥۣۧ;

    const/4 v1, 0x0

    const-string v2, "http/1.0"

    const-string v3, "HTTP_1_0"

    invoke-direct {v0, v3, v1, v2}, LYue/ۥۡۥۣۧ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LYue/ۥۡۥۣۧ;->ۥ۟۟۠ۥ:LYue/ۥۡۥۣۧ;

    new-instance v0, LYue/ۥۡۥۣۧ;

    const/4 v1, 0x1

    const-string v2, "http/1.1"

    const-string v3, "HTTP_1_1"

    invoke-direct {v0, v3, v1, v2}, LYue/ۥۡۥۣۧ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LYue/ۥۡۥۣۧ;->ۥ۟۟۠ۦ:LYue/ۥۡۥۣۧ;

    new-instance v0, LYue/ۥۡۥۣۧ;

    const/4 v1, 0x2

    const-string v2, "spdy/3.1"

    const-string v3, "SPDY_3"

    invoke-direct {v0, v3, v1, v2}, LYue/ۥۡۥۣۧ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LYue/ۥۡۥۣۧ;->ۥ۟۟۠ۧ:LYue/ۥۡۥۣۧ;

    new-instance v0, LYue/ۥۡۥۣۧ;

    const/4 v1, 0x3

    const-string v2, "h2"

    const-string v3, "HTTP_2"

    invoke-direct {v0, v3, v1, v2}, LYue/ۥۡۥۣۧ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LYue/ۥۡۥۣۧ;->ۥ۟۟۠ۨ:LYue/ۥۡۥۣۧ;

    new-instance v0, LYue/ۥۡۥۣۧ;

    const/4 v1, 0x4

    const-string v2, "h2_prior_knowledge"

    const-string v3, "H2_PRIOR_KNOWLEDGE"

    invoke-direct {v0, v3, v1, v2}, LYue/ۥۡۥۣۧ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LYue/ۥۡۥۣۧ;->ۥ۟۟ۡ:LYue/ۥۡۥۣۧ;

    new-instance v0, LYue/ۥۡۥۣۧ;

    const/4 v1, 0x5

    const-string v2, "quic"

    const-string v3, "QUIC"

    invoke-direct {v0, v3, v1, v2}, LYue/ۥۡۥۣۧ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LYue/ۥۡۥۣۧ;->ۥ۟۟ۡ۟:LYue/ۥۡۥۣۧ;

    invoke-static {}, LYue/ۥۡۥۣۧ;->ۥ()[LYue/ۥۡۥۣۧ;

    move-result-object v0

    sput-object v0, LYue/ۥۡۥۣۧ;->ۥ۟۟ۡ۠:[LYue/ۥۡۥۣۧ;

    new-instance v0, LYue/ۥۡۥۣۧ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۡۥۣۧ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۡۥۣۧ;->ۥ۟۟۠ۤ:LYue/ۥۡۥۣۧ$ۥ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LYue/ۥۡۥۣۧ;->ۥۣ۟۟۠:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LYue/ۥۡۥۣۧ;
    .locals 1

    const-class v0, LYue/ۥۡۥۣۧ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LYue/ۥۡۥۣۧ;

    return-object p0
.end method

.method public static values()[LYue/ۥۡۥۣۧ;
    .locals 1

    sget-object v0, LYue/ۥۡۥۣۧ;->ۥ۟۟ۡ۠:[LYue/ۥۡۥۣۧ;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LYue/ۥۡۥۣۧ;

    return-object v0
.end method

.method public static final synthetic ۥ()[LYue/ۥۡۥۣۧ;
    .locals 6

    sget-object v0, LYue/ۥۡۥۣۧ;->ۥ۟۟۠ۥ:LYue/ۥۡۥۣۧ;

    sget-object v1, LYue/ۥۡۥۣۧ;->ۥ۟۟۠ۦ:LYue/ۥۡۥۣۧ;

    sget-object v2, LYue/ۥۡۥۣۧ;->ۥ۟۟۠ۧ:LYue/ۥۡۥۣۧ;

    sget-object v3, LYue/ۥۡۥۣۧ;->ۥ۟۟۠ۨ:LYue/ۥۡۥۣۧ;

    sget-object v4, LYue/ۥۡۥۣۧ;->ۥ۟۟ۡ:LYue/ۥۡۥۣۧ;

    sget-object v5, LYue/ۥۡۥۣۧ;->ۥ۟۟ۡ۟:LYue/ۥۡۥۣۧ;

    filled-new-array/range {v0 .. v5}, [LYue/ۥۡۥۣۧ;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic ۥ۟۟۟(LYue/ۥۡۥۣۧ;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LYue/ۥۡۥۣۧ;->ۥۣ۟۟۠:Ljava/lang/String;

    return-object p0
.end method

.method public static final ۥ۟۟۟۟(Ljava/lang/String;)LYue/ۥۡۥۣۧ;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, LYue/ۥۡۥۣۧ;->ۥ۟۟۠ۤ:LYue/ۥۡۥۣۧ$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥۡۥۣۧ$ۥ;->ۥ(Ljava/lang/String;)LYue/ۥۡۥۣۧ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۥۣۧ;->ۥۣ۟۟۠:Ljava/lang/String;

    return-object v0
.end method
