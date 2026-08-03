.class public final LLu;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Las;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Las;

.field public final c:Las;

.field public final d:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Landroid/content/Context;Las;Las;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LLu;->a:Landroid/content/Context;

    iput-object p2, p0, LLu;->b:Las;

    iput-object p3, p0, LLu;->c:Las;

    iput-object p4, p0, LLu;->d:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 2

    check-cast p1, Landroid/net/Uri;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p1}, LOj;->H(Landroid/net/Uri;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Ljava/lang/Object;IILvt;)LZr;
    .locals 10

    move-object v4, p1

    check-cast v4, Landroid/net/Uri;

    new-instance p1, LZr;

    new-instance v9, Let;

    invoke-direct {v9, v4}, Let;-><init>(Ljava/lang/Object;)V

    new-instance v0, LKu;

    iget-object v3, p0, LLu;->c:Las;

    iget-object v8, p0, LLu;->d:Ljava/lang/Class;

    iget-object v1, p0, LLu;->a:Landroid/content/Context;

    iget-object v2, p0, LLu;->b:Las;

    move v5, p2

    move v6, p3

    move-object v7, p4

    invoke-direct/range {v0 .. v8}, LKu;-><init>(Landroid/content/Context;Las;Las;Landroid/net/Uri;IILvt;Ljava/lang/Class;)V

    invoke-direct {p1, v9, v0}, LZr;-><init>(LSm;Ltc;)V

    return-object p1
.end method
