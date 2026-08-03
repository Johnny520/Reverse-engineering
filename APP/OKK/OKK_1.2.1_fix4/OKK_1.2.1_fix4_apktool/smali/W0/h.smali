.class public final enum LW0/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:LW0/h;

.field public static final enum c:LW0/h;

.field public static final synthetic d:[LW0/h;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, LW0/h;

    const-string v1, "IGNORE_CASE"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1}, LW0/h;-><init>(IILjava/lang/String;)V

    sput-object v0, LW0/h;->b:LW0/h;

    new-instance v1, LW0/h;

    const/16 v2, 0x8

    const-string v4, "MULTILINE"

    const/4 v5, 0x1

    invoke-direct {v1, v5, v2, v4}, LW0/h;-><init>(IILjava/lang/String;)V

    new-instance v2, LW0/h;

    const-string v4, "LITERAL"

    const/16 v6, 0x10

    invoke-direct {v2, v3, v6, v4}, LW0/h;-><init>(IILjava/lang/String;)V

    new-instance v3, LW0/h;

    const-string v4, "UNIX_LINES"

    const/4 v6, 0x3

    invoke-direct {v3, v6, v5, v4}, LW0/h;-><init>(IILjava/lang/String;)V

    new-instance v4, LW0/h;

    const-string v5, "COMMENTS"

    const/4 v6, 0x4

    invoke-direct {v4, v6, v6, v5}, LW0/h;-><init>(IILjava/lang/String;)V

    new-instance v5, LW0/h;

    const/4 v6, 0x5

    const/16 v7, 0x20

    const-string v8, "DOT_MATCHES_ALL"

    invoke-direct {v5, v6, v7, v8}, LW0/h;-><init>(IILjava/lang/String;)V

    sput-object v5, LW0/h;->c:LW0/h;

    new-instance v6, LW0/h;

    const/4 v7, 0x6

    const/16 v8, 0x80

    const-string v9, "CANON_EQ"

    invoke-direct {v6, v7, v8, v9}, LW0/h;-><init>(IILjava/lang/String;)V

    filled-new-array/range {v0 .. v6}, [LW0/h;

    move-result-object v0

    sput-object v0, LW0/h;->d:[LW0/h;

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p3, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p2, p0, LW0/h;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LW0/h;
    .locals 1

    const-class v0, LW0/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LW0/h;

    return-object p0
.end method

.method public static values()[LW0/h;
    .locals 1

    sget-object v0, LW0/h;->d:[LW0/h;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LW0/h;

    return-object v0
.end method
