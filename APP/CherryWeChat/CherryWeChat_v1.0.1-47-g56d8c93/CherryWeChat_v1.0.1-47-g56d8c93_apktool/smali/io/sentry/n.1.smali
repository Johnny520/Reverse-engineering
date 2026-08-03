.class public final enum Lio/sentry/n;
.super Ljava/lang/Enum;
.source ""


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/n;

.field public static final enum All:Lio/sentry/n;

.field public static final enum Attachment:Lio/sentry/n;

.field public static final enum Default:Lio/sentry/n;

.field public static final enum Error:Lio/sentry/n;

.field public static final enum Feedback:Lio/sentry/n;

.field public static final enum LogItem:Lio/sentry/n;

.field public static final enum Monitor:Lio/sentry/n;

.field public static final enum Profile:Lio/sentry/n;

.field public static final enum ProfileChunkUi:Lio/sentry/n;

.field public static final enum Replay:Lio/sentry/n;

.field public static final enum Security:Lio/sentry/n;

.field public static final enum Session:Lio/sentry/n;

.field public static final enum Span:Lio/sentry/n;

.field public static final enum Transaction:Lio/sentry/n;

.field public static final enum Unknown:Lio/sentry/n;

.field public static final enum UserReport:Lio/sentry/n;


# instance fields
.field private final category:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Lio/sentry/n;
    .locals 17

    sget-object v1, Lio/sentry/n;->All:Lio/sentry/n;

    sget-object v2, Lio/sentry/n;->Default:Lio/sentry/n;

    sget-object v3, Lio/sentry/n;->Error:Lio/sentry/n;

    sget-object v4, Lio/sentry/n;->Feedback:Lio/sentry/n;

    sget-object v5, Lio/sentry/n;->Session:Lio/sentry/n;

    sget-object v6, Lio/sentry/n;->Attachment:Lio/sentry/n;

    sget-object v7, Lio/sentry/n;->LogItem:Lio/sentry/n;

    sget-object v8, Lio/sentry/n;->Monitor:Lio/sentry/n;

    sget-object v9, Lio/sentry/n;->Profile:Lio/sentry/n;

    sget-object v10, Lio/sentry/n;->ProfileChunkUi:Lio/sentry/n;

    sget-object v11, Lio/sentry/n;->Transaction:Lio/sentry/n;

    sget-object v12, Lio/sentry/n;->Replay:Lio/sentry/n;

    sget-object v13, Lio/sentry/n;->Span:Lio/sentry/n;

    sget-object v14, Lio/sentry/n;->Security:Lio/sentry/n;

    sget-object v15, Lio/sentry/n;->UserReport:Lio/sentry/n;

    sget-object v16, Lio/sentry/n;->Unknown:Lio/sentry/n;

    filled-new-array/range {v1 .. v16}, [Lio/sentry/n;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/sentry/n;

    const/4 v1, 0x0

    const-string v2, "__all__"

    const-string v3, "All"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/n;->All:Lio/sentry/n;

    new-instance v0, Lio/sentry/n;

    const/4 v1, 0x1

    const-string v2, "default"

    const-string v3, "Default"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/n;->Default:Lio/sentry/n;

    new-instance v0, Lio/sentry/n;

    const/4 v1, 0x2

    const-string v2, "error"

    const-string v3, "Error"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/n;->Error:Lio/sentry/n;

    new-instance v0, Lio/sentry/n;

    const/4 v1, 0x3

    const-string v2, "feedback"

    const-string v3, "Feedback"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/n;->Feedback:Lio/sentry/n;

    new-instance v0, Lio/sentry/n;

    const/4 v1, 0x4

    const-string v2, "session"

    const-string v3, "Session"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/n;->Session:Lio/sentry/n;

    new-instance v0, Lio/sentry/n;

    const/4 v1, 0x5

    const-string v2, "attachment"

    const-string v3, "Attachment"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/n;->Attachment:Lio/sentry/n;

    new-instance v0, Lio/sentry/n;

    const/4 v1, 0x6

    const-string v2, "log_item"

    const-string v3, "LogItem"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/n;->LogItem:Lio/sentry/n;

    new-instance v0, Lio/sentry/n;

    const/4 v1, 0x7

    const-string v2, "monitor"

    const-string v3, "Monitor"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/n;->Monitor:Lio/sentry/n;

    new-instance v0, Lio/sentry/n;

    const/16 v1, 0x8

    const-string v2, "profile"

    const-string v3, "Profile"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/n;->Profile:Lio/sentry/n;

    new-instance v0, Lio/sentry/n;

    const/16 v1, 0x9

    const-string v2, "profile_chunk_ui"

    const-string v3, "ProfileChunkUi"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/n;->ProfileChunkUi:Lio/sentry/n;

    new-instance v0, Lio/sentry/n;

    const/16 v1, 0xa

    const-string v2, "transaction"

    const-string v3, "Transaction"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/n;->Transaction:Lio/sentry/n;

    new-instance v0, Lio/sentry/n;

    const/16 v1, 0xb

    const-string v2, "replay"

    const-string v3, "Replay"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/n;->Replay:Lio/sentry/n;

    new-instance v0, Lio/sentry/n;

    const/16 v1, 0xc

    const-string v2, "span"

    const-string v3, "Span"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/n;->Span:Lio/sentry/n;

    new-instance v0, Lio/sentry/n;

    const/16 v1, 0xd

    const-string v2, "security"

    const-string v3, "Security"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/n;->Security:Lio/sentry/n;

    new-instance v0, Lio/sentry/n;

    const/16 v1, 0xe

    const-string v2, "user_report"

    const-string v3, "UserReport"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/n;->UserReport:Lio/sentry/n;

    new-instance v0, Lio/sentry/n;

    const/16 v1, 0xf

    const-string v2, "unknown"

    const-string v3, "Unknown"

    invoke-direct {v0, v3, v1, v2}, Lio/sentry/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/sentry/n;->Unknown:Lio/sentry/n;

    invoke-static {}, Lio/sentry/n;->$values()[Lio/sentry/n;

    move-result-object v0

    sput-object v0, Lio/sentry/n;->$VALUES:[Lio/sentry/n;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lio/sentry/n;->category:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/sentry/n;
    .locals 1

    const-class v0, Lio/sentry/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/n;

    return-object p0
.end method

.method public static values()[Lio/sentry/n;
    .locals 1

    sget-object v0, Lio/sentry/n;->$VALUES:[Lio/sentry/n;

    invoke-virtual {v0}, [Lio/sentry/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/n;

    return-object v0
.end method


# virtual methods
.method public getCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/n;->category:Ljava/lang/String;

    return-object v0
.end method
