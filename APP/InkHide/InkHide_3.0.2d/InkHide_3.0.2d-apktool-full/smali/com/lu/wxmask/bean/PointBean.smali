.class public final Lcom/lu/wxmask/bean/PointBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lc/a;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lu/wxmask/bean/PointBean$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/lu/wxmask/bean/PointBean$Companion;


# instance fields
.field private clazz:Ljava/lang/String;

.field private featId:Ljava/lang/String;

.field private method:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/lu/wxmask/bean/PointBean$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/lu/wxmask/bean/PointBean$Companion;-><init>(LN0/e;)V

    sput-object v0, Lcom/lu/wxmask/bean/PointBean;->Companion:Lcom/lu/wxmask/bean/PointBean$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "featId"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "clazz"

    .line 7
    .line 8
    invoke-static {p2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "method"

    .line 12
    .line 13
    invoke-static {p3, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/lu/wxmask/bean/PointBean;->featId:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/lu/wxmask/bean/PointBean;->clazz:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/lu/wxmask/bean/PointBean;->method:Ljava/lang/String;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final getClazz()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/bean/PointBean;->clazz:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFeatId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/bean/PointBean;->featId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMethod()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/bean/PointBean;->method:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setClazz(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/lu/wxmask/bean/PointBean;->clazz:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setFeatId(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/lu/wxmask/bean/PointBean;->featId:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setMethod(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/lu/wxmask/bean/PointBean;->method:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method
