.class public final enum LVr;
.super Ljava/lang/Enum;
.source ""


# static fields
.field public static final enum c:LVr;

.field public static final enum d:LVr;

.field public static final enum e:LVr;

.field public static final synthetic f:[LVr;

.field public static final synthetic g:Log;


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, LVr;

    const-wide v1, -0x518fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v2, v3}, LVr;-><init>(Ljava/lang/String;III)V

    sput-object v0, LVr;->c:LVr;

    new-instance v1, LVr;

    const-wide v4, -0x524fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    const/16 v5, 0x22

    invoke-direct {v1, v2, v4, v4, v5}, LVr;-><init>(Ljava/lang/String;III)V

    sput-object v1, LVr;->d:LVr;

    new-instance v2, LVr;

    const-wide v4, -0x52ffffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    const/16 v6, 0x25

    invoke-direct {v2, v4, v5, v3, v6}, LVr;-><init>(Ljava/lang/String;III)V

    sput-object v2, LVr;->e:LVr;

    filled-new-array {v0, v1, v2}, [LVr;

    move-result-object v0

    sput-object v0, LVr;->f:[LVr;

    new-instance v1, Log;

    invoke-direct {v1, v0}, Log;-><init>([Ljava/lang/Enum;)V

    sput-object v1, LVr;->g:Log;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;III)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LVr;->a:I

    iput p4, p0, LVr;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LVr;
    .locals 1

    const-class v0, LVr;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LVr;

    return-object p0
.end method

.method public static values()[LVr;
    .locals 1

    sget-object v0, LVr;->f:[LVr;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LVr;

    return-object v0
.end method
