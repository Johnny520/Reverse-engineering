.class public final enum Lf0/Q;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum c:Lf0/Q;

.field public static final enum d:Lf0/Q;

.field public static final enum e:Lf0/Q;

.field public static final synthetic f:[Lf0/Q;

.field public static final synthetic g:LK0/a;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lf0/Q;

    const-string v1, "Features"

    const/4 v2, 0x0

    const-string v3, "\u529f\u80fd"

    const-string v4, "\u26a1"

    invoke-direct {v0, v1, v2, v3, v4}, Lf0/Q;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lf0/Q;->c:Lf0/Q;

    new-instance v1, Lf0/Q;

    const-string v2, "Diagnostics"

    const/4 v3, 0x1

    const-string v4, "\u8bca\u65ad"

    const-string v5, "\ud83d\udee1"

    invoke-direct {v1, v2, v3, v4, v5}, Lf0/Q;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lf0/Q;->d:Lf0/Q;

    new-instance v2, Lf0/Q;

    const-string v3, "Settings"

    const/4 v4, 0x2

    const-string v5, "\u5173\u4e8e"

    const-string v6, "\u2699"

    invoke-direct {v2, v3, v4, v5, v6}, Lf0/Q;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lf0/Q;->e:Lf0/Q;

    filled-new-array {v0, v1, v2}, [Lf0/Q;

    move-result-object v0

    sput-object v0, Lf0/Q;->f:[Lf0/Q;

    new-instance v1, LK0/a;

    invoke-direct {v1, v0}, LK0/a;-><init>([Ljava/lang/Enum;)V

    sput-object v1, Lf0/Q;->g:LK0/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lf0/Q;->a:Ljava/lang/String;

    iput-object p4, p0, Lf0/Q;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lf0/Q;
    .locals 1

    const-class v0, Lf0/Q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf0/Q;

    return-object p0
.end method

.method public static values()[Lf0/Q;
    .locals 1

    sget-object v0, Lf0/Q;->f:[Lf0/Q;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf0/Q;

    return-object v0
.end method
