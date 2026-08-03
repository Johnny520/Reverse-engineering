.class public LYue/ۥ۟ۤۨ۠$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۤۨ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public ۥ:Landroid/view/View;

.field public ۥ۟:Ljava/lang/String;

.field public ۥ۟۟:F


# direct methods
.method public constructor <init>(Landroid/view/View;F)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۤۨ۠$ۥ۟۟;->ۥ:Landroid/view/View;

    iput p2, p0, LYue/ۥ۟ۤۨ۠$ۥ۟۟;->ۥ۟۟:F

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۟ۤۨ۠$ۥ۟۟;->ۥ۟:Ljava/lang/String;

    invoke-static {}, LYue/ۥ۟ۤۨ۠;->ۥ۟۟۟ۢ()Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۟ۤۨ۠$ۥ۟۟;->ۥ۟:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, LYue/ۥ۟ۤۨ۠;->ۥ۟۟۟ۢ()Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۟ۤۨ۠$ۥ۟۟;->ۥ۟:Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static synthetic yue_xin_qaq()V
    .locals 0

    return-void
.end method


# virtual methods
.method public ۥ()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۤۨ۠$ۥ۟۟;->ۥ:Landroid/view/View;

    return-object v0
.end method

.method public ۥ۟()F
    .locals 2

    invoke-static {}, LYue/ۥ۟ۤۨ۠;->ۥ۟۟۟ۢ()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, LYue/ۥ۟ۤۨ۠$ۥ۟۟;->ۥ۟:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LYue/ۥ۟ۤۨ۠;->ۥ۟۟۟ۢ()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, LYue/ۥ۟ۤۨ۠$ۥ۟۟;->ۥ۟:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0

    :cond_0
    iget v0, p0, LYue/ۥ۟ۤۨ۠$ۥ۟۟;->ۥ۟۟:F

    return v0
.end method

.method public ۥ۟۟(Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۤۨ۠$ۥ۟۟;->ۥ:Landroid/view/View;

    return-void
.end method

.method public ۥ۟۟۟(F)V
    .locals 0

    iput p1, p0, LYue/ۥ۟ۤۨ۠$ۥ۟۟;->ۥ۟۟:F

    return-void
.end method
