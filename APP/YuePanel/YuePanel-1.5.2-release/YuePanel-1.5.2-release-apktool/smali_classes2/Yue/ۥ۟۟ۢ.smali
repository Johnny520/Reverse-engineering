.class public abstract LYue/ۥ۟۟ۢ;
.super Ljava/util/AbstractSet;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;
.implements LYue/ۥ۠ۦۣۨ;


# annotations
.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.1"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractSet<",
        "TE;>;",
        "Ljava/util/Set<",
        "TE;>;",
        "LYue/\u06e5\u06e0\u06e6\u06e3\u06e8;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract add(Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟۟ۢ;->ۥ()I

    move-result v0

    return v0
.end method

.method public abstract ۥ()I
.end method
