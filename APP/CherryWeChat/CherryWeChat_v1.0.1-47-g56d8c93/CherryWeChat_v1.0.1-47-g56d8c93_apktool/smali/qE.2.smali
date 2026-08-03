.class public final LqE;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:LYt;


# instance fields
.field public a:I

.field public b:Llv;

.field public c:Llv;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYt;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, LYt;-><init>(I)V

    sput-object v0, LqE;->d:LYt;

    return-void
.end method

.method public static a()LqE;
    .locals 1

    sget-object v0, LqE;->d:LYt;

    invoke-virtual {v0}, LYt;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LqE;

    if-nez v0, :cond_0

    new-instance v0, LqE;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :cond_0
    return-object v0
.end method
