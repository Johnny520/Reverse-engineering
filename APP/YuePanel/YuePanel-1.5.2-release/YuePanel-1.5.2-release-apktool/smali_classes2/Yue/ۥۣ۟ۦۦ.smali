.class public abstract LYue/ۥۣ۟ۦۦ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۦۢۡ;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۟ۦۦ$ۥ;
    }
.end annotation


# static fields
.field public static final NO_RECEIVER:Ljava/lang/Object;
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation
.end field


# instance fields
.field private final isTopLevel:Z
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation
.end field

.field private final owner:Ljava/lang/Class;
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation
.end field

.field protected final receiver:Ljava/lang/Object;
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation
.end field

.field private transient reflected:LYue/ۥ۠ۦۢۡ;

.field private final signature:Ljava/lang/String;
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, LYue/ۥۣ۟ۦۦ$ۥ;->ۥ()LYue/ۥۣ۟ۦۦ$ۥ;

    move-result-object v0

    sput-object v0, LYue/ۥۣ۟ۦۦ;->NO_RECEIVER:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, LYue/ۥۣ۟ۦۦ;->NO_RECEIVER:Ljava/lang/Object;

    invoke-direct {p0, v0}, LYue/ۥۣ۟ۦۦ;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 6
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 2
    invoke-direct/range {v0 .. v5}, LYue/ۥۣ۟ۦۦ;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LYue/ۥۣ۟ۦۦ;->receiver:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, LYue/ۥۣ۟ۦۦ;->owner:Ljava/lang/Class;

    .line 6
    iput-object p3, p0, LYue/ۥۣ۟ۦۦ;->name:Ljava/lang/String;

    .line 7
    iput-object p4, p0, LYue/ۥۣ۟ۦۦ;->signature:Ljava/lang/String;

    .line 8
    iput-boolean p5, p0, LYue/ۥۣ۟ۦۦ;->isTopLevel:Z

    return-void
.end method


# virtual methods
.method public varargs call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣ۟ۦۦ;->getReflected()LYue/ۥ۠ۦۢۡ;

    move-result-object v0

    invoke-interface {v0, p1}, LYue/ۥ۠ۦۢۡ;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public callBy(Ljava/util/Map;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣ۟ۦۦ;->getReflected()LYue/ۥ۠ۦۢۡ;

    move-result-object v0

    invoke-interface {v0, p1}, LYue/ۥ۠ۦۢۡ;->callBy(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public compute()LYue/ۥ۠ۦۢۡ;
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۦۦ;->reflected:LYue/ۥ۠ۦۢۡ;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۣ۟ۦۦ;->computeReflected()LYue/ۥ۠ۦۢۡ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۣ۟ۦۦ;->reflected:LYue/ۥ۠ۦۢۡ;

    :cond_0
    return-object v0
.end method

.method public abstract computeReflected()LYue/ۥ۠ۦۢۡ;
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۟ۦۦ;->getReflected()LYue/ۥ۠ۦۢۡ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۠ۦۢ۠;->getAnnotations()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getBoundReceiver()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۦۦ;->receiver:Ljava/lang/Object;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۦۦ;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getOwner()LYue/ۥ۠ۦۢۦ;
    .locals 2

    iget-object v0, p0, LYue/ۥۣ۟ۦۦ;->owner:Ljava/lang/Class;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, LYue/ۥۣ۟ۦۦ;->isTopLevel:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, LYue/ۥۡۦۣ;->ۥ۟۟۟ۡ(Ljava/lang/Class;)LYue/ۥ۠ۦۢۦ;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {v0}, LYue/ۥۡۦۣ;->ۥ۟۟۟(Ljava/lang/Class;)LYue/ۥ۠ۦۢۢ;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e6\u06e4;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۟ۦۦ;->getReflected()LYue/ۥ۠ۦۢۡ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۠ۦۢۡ;->getParameters()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getReflected()LYue/ۥ۠ۦۢۡ;
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۟ۦۦ;->compute()LYue/ۥ۠ۦۢۡ;

    move-result-object v0

    if-eq v0, p0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, LYue/ۥ۠ۦۧۧ;

    invoke-direct {v0}, LYue/ۥ۠ۦۧۧ;-><init>()V

    throw v0
.end method

.method public getReturnType()LYue/ۥ۠ۦۣۤ;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣ۟ۦۦ;->getReflected()LYue/ۥ۠ۦۢۡ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۠ۦۢۡ;->getReturnType()LYue/ۥ۠ۦۣۤ;

    move-result-object v0

    return-object v0
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۦۦ;->signature:Ljava/lang/String;

    return-object v0
.end method

.method public getTypeParameters()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e6\u06e4\u06e5;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۟ۦۦ;->getReflected()LYue/ۥ۠ۦۢۡ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۠ۦۢۡ;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getVisibility()LYue/ۥ۠ۦۤۨ;
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۟ۦۦ;->getReflected()LYue/ۥ۠ۦۢۡ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۠ۦۢۡ;->getVisibility()LYue/ۥ۠ۦۤۨ;

    move-result-object v0

    return-object v0
.end method

.method public isAbstract()Z
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۟ۦۦ;->getReflected()LYue/ۥ۠ۦۢۡ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۠ۦۢۡ;->isAbstract()Z

    move-result v0

    return v0
.end method

.method public isFinal()Z
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۟ۦۦ;->getReflected()LYue/ۥ۠ۦۢۡ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۠ۦۢۡ;->isFinal()Z

    move-result v0

    return v0
.end method

.method public isOpen()Z
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۟ۦۦ;->getReflected()LYue/ۥ۠ۦۢۡ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۠ۦۢۡ;->isOpen()Z

    move-result v0

    return v0
.end method

.method public isSuspend()Z
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۟ۦۦ;->getReflected()LYue/ۥ۠ۦۢۡ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥ۠ۦۢۡ;->isSuspend()Z

    move-result v0

    return v0
.end method
