.class public final enum Lc0/E0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final e:Lc0/r;

.field public static final f:Ljava/util/List;

.field public static final synthetic g:[Lc0/E0;

.field public static final synthetic h:LK0/a;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 22

    new-instance v7, Lc0/E0;

    const-string v3, "qrcode"

    const-string v4, "\u6211\u7684\u4e8c\u7ef4\u7801"

    const-string v1, "QRCODE"

    const/4 v2, 0x0

    const-string v5, "\u5c55\u793a\u4e2a\u4eba\u4e8c\u7ef4\u7801"

    const-string v6, "\u25a6"

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lc0/E0;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lc0/E0;

    const-string v11, "pay"

    const-string v12, "\u6536\u4ed8\u6b3e"

    const-string v9, "PAY"

    const/4 v10, 0x1

    const-string v13, "\u4ed8\u6b3e\u7801 / \u6536\u6b3e"

    const-string v14, "\u00a5"

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lc0/E0;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lc0/E0;

    const-string v18, "service"

    const-string v19, "\u670d\u52a1"

    const-string v16, "SERVICE"

    const/16 v17, 0x2

    const-string v20, "\u652f\u4ed8\u4e0e\u670d\u52a1"

    const-string v21, "\u25c8"

    move-object v15, v1

    invoke-direct/range {v15 .. v21}, Lc0/E0;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lc0/E0;

    const-string v11, "favorite"

    const-string v12, "\u6536\u85cf"

    const-string v9, "FAVORITE"

    const/4 v10, 0x3

    const-string v13, "\u6211\u7684\u6536\u85cf"

    const-string v14, "\u2605"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, Lc0/E0;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v7, v0, v1, v2}, [Lc0/E0;

    move-result-object v1

    sput-object v1, Lc0/E0;->g:[Lc0/E0;

    new-instance v3, LK0/a;

    invoke-direct {v3, v1}, LK0/a;-><init>([Ljava/lang/Enum;)V

    sput-object v3, Lc0/E0;->h:LK0/a;

    new-instance v1, Lc0/r;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sput-object v1, Lc0/E0;->e:Lc0/r;

    filled-new-array {v7, v0, v2}, [Lc0/E0;

    move-result-object v0

    invoke-static {v0}, LE0/m;->h0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lc0/E0;->f:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lc0/E0;->a:Ljava/lang/String;

    iput-object p4, p0, Lc0/E0;->b:Ljava/lang/String;

    iput-object p5, p0, Lc0/E0;->c:Ljava/lang/String;

    iput-object p6, p0, Lc0/E0;->d:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lc0/E0;
    .locals 1

    const-class v0, Lc0/E0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc0/E0;

    return-object p0
.end method

.method public static values()[Lc0/E0;
    .locals 1

    sget-object v0, Lc0/E0;->g:[Lc0/E0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc0/E0;

    return-object v0
.end method
