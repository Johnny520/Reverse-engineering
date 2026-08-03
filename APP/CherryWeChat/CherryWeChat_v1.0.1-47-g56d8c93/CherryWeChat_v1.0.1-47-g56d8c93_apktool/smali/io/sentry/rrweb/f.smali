.class public final enum Lio/sentry/rrweb/f;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lio/sentry/C0;


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/rrweb/f;

.field public static final enum Blur:Lio/sentry/rrweb/f;

.field public static final enum Click:Lio/sentry/rrweb/f;

.field public static final enum ContextMenu:Lio/sentry/rrweb/f;

.field public static final enum DblClick:Lio/sentry/rrweb/f;

.field public static final enum Focus:Lio/sentry/rrweb/f;

.field public static final enum MouseDown:Lio/sentry/rrweb/f;

.field public static final enum MouseUp:Lio/sentry/rrweb/f;

.field public static final enum TouchCancel:Lio/sentry/rrweb/f;

.field public static final enum TouchEnd:Lio/sentry/rrweb/f;

.field public static final enum TouchMove_Departed:Lio/sentry/rrweb/f;

.field public static final enum TouchStart:Lio/sentry/rrweb/f;


# direct methods
.method private static synthetic $values()[Lio/sentry/rrweb/f;
    .locals 11

    sget-object v0, Lio/sentry/rrweb/f;->MouseUp:Lio/sentry/rrweb/f;

    sget-object v1, Lio/sentry/rrweb/f;->MouseDown:Lio/sentry/rrweb/f;

    sget-object v2, Lio/sentry/rrweb/f;->Click:Lio/sentry/rrweb/f;

    sget-object v3, Lio/sentry/rrweb/f;->ContextMenu:Lio/sentry/rrweb/f;

    sget-object v4, Lio/sentry/rrweb/f;->DblClick:Lio/sentry/rrweb/f;

    sget-object v5, Lio/sentry/rrweb/f;->Focus:Lio/sentry/rrweb/f;

    sget-object v6, Lio/sentry/rrweb/f;->Blur:Lio/sentry/rrweb/f;

    sget-object v7, Lio/sentry/rrweb/f;->TouchStart:Lio/sentry/rrweb/f;

    sget-object v8, Lio/sentry/rrweb/f;->TouchMove_Departed:Lio/sentry/rrweb/f;

    sget-object v9, Lio/sentry/rrweb/f;->TouchEnd:Lio/sentry/rrweb/f;

    sget-object v10, Lio/sentry/rrweb/f;->TouchCancel:Lio/sentry/rrweb/f;

    filled-new-array/range {v0 .. v10}, [Lio/sentry/rrweb/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/sentry/rrweb/f;

    const-string v1, "MouseUp"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/rrweb/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/rrweb/f;->MouseUp:Lio/sentry/rrweb/f;

    new-instance v0, Lio/sentry/rrweb/f;

    const-string v1, "MouseDown"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/sentry/rrweb/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/rrweb/f;->MouseDown:Lio/sentry/rrweb/f;

    new-instance v0, Lio/sentry/rrweb/f;

    const-string v1, "Click"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio/sentry/rrweb/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/rrweb/f;->Click:Lio/sentry/rrweb/f;

    new-instance v0, Lio/sentry/rrweb/f;

    const-string v1, "ContextMenu"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lio/sentry/rrweb/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/rrweb/f;->ContextMenu:Lio/sentry/rrweb/f;

    new-instance v0, Lio/sentry/rrweb/f;

    const-string v1, "DblClick"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lio/sentry/rrweb/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/rrweb/f;->DblClick:Lio/sentry/rrweb/f;

    new-instance v0, Lio/sentry/rrweb/f;

    const-string v1, "Focus"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lio/sentry/rrweb/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/rrweb/f;->Focus:Lio/sentry/rrweb/f;

    new-instance v0, Lio/sentry/rrweb/f;

    const-string v1, "Blur"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lio/sentry/rrweb/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/rrweb/f;->Blur:Lio/sentry/rrweb/f;

    new-instance v0, Lio/sentry/rrweb/f;

    const-string v1, "TouchStart"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lio/sentry/rrweb/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/rrweb/f;->TouchStart:Lio/sentry/rrweb/f;

    new-instance v0, Lio/sentry/rrweb/f;

    const-string v1, "TouchMove_Departed"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lio/sentry/rrweb/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/rrweb/f;->TouchMove_Departed:Lio/sentry/rrweb/f;

    new-instance v0, Lio/sentry/rrweb/f;

    const-string v1, "TouchEnd"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lio/sentry/rrweb/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/rrweb/f;->TouchEnd:Lio/sentry/rrweb/f;

    new-instance v0, Lio/sentry/rrweb/f;

    const-string v1, "TouchCancel"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lio/sentry/rrweb/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/rrweb/f;->TouchCancel:Lio/sentry/rrweb/f;

    invoke-static {}, Lio/sentry/rrweb/f;->$values()[Lio/sentry/rrweb/f;

    move-result-object v0

    sput-object v0, Lio/sentry/rrweb/f;->$VALUES:[Lio/sentry/rrweb/f;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/sentry/rrweb/f;
    .locals 1

    const-class v0, Lio/sentry/rrweb/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/rrweb/f;

    return-object p0
.end method

.method public static values()[Lio/sentry/rrweb/f;
    .locals 1

    sget-object v0, Lio/sentry/rrweb/f;->$VALUES:[Lio/sentry/rrweb/f;

    invoke-virtual {v0}, [Lio/sentry/rrweb/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/rrweb/f;

    return-object v0
.end method


# virtual methods
.method public serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    int-to-long v0, p2

    check-cast p1, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, v0, v1}, Lio/sentry/internal/debugmeta/c;->v(J)Lio/sentry/internal/debugmeta/c;

    return-void
.end method
