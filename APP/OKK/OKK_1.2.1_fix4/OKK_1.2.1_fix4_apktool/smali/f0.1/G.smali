.class public final enum Lf0/G;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum d:Lf0/G;

.field public static final enum e:Lf0/G;

.field public static final enum f:Lf0/G;

.field public static final enum g:Lf0/G;

.field public static final enum h:Lf0/G;

.field public static final synthetic i:[Lf0/G;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v6, Lf0/G;

    const/4 v2, 0x0

    const-string v3, "\u804a\u5929\u589e\u5f3a"

    const-string v1, "Chat"

    const-string v4, "\ud83d\udcac"

    const-string v5, "#2F8A4E"

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lf0/G;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v6, Lf0/G;->d:Lf0/G;

    new-instance v0, Lf0/G;

    const/4 v9, 0x1

    const-string v10, "\u670b\u53cb\u5708\u9632\u62a4"

    const-string v8, "Protect"

    const-string v11, "\u2b55"

    const-string v12, "#2B6CB0"

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lf0/G;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lf0/G;->e:Lf0/G;

    new-instance v1, Lf0/G;

    const/4 v15, 0x2

    const-string v16, "\u89c6\u89c9\u5916\u89c2"

    const-string v14, "Beauty"

    const-string v17, "\u2728"

    const-string v18, "#805AD5"

    move-object v13, v1

    invoke-direct/range {v13 .. v18}, Lf0/G;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lf0/G;->f:Lf0/G;

    new-instance v2, Lf0/G;

    const/4 v9, 0x3

    const-string v10, "\u589e\u5f3a\u8f85\u52a9"

    const-string v8, "Assist"

    const-string v11, "\u26a1"

    const-string v12, "#DD6B20"

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, Lf0/G;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lf0/G;->g:Lf0/G;

    new-instance v3, Lf0/G;

    const/4 v15, 0x4

    const-string v16, "\u754c\u9762\u7ec6\u8282"

    const-string v14, "Interface"

    const-string v17, "\ud83d\udcd0"

    const-string v18, "#319795"

    move-object v13, v3

    invoke-direct/range {v13 .. v18}, Lf0/G;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lf0/G;->h:Lf0/G;

    filled-new-array {v6, v0, v1, v2, v3}, [Lf0/G;

    move-result-object v0

    sput-object v0, Lf0/G;->i:[Lf0/G;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lf0/G;->a:Ljava/lang/String;

    iput-object p4, p0, Lf0/G;->b:Ljava/lang/String;

    iput-object p5, p0, Lf0/G;->c:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lf0/G;
    .locals 1

    const-class v0, Lf0/G;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf0/G;

    return-object p0
.end method

.method public static values()[Lf0/G;
    .locals 1

    sget-object v0, Lf0/G;->i:[Lf0/G;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf0/G;

    return-object v0
.end method
