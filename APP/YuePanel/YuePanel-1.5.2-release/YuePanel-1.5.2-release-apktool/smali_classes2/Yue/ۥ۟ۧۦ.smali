.class public interface abstract LYue/ۥ۟ۧۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۧۦ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ:LYue/ۥ۟ۧۦ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:LYue/ۥ۟ۧۦ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LYue/ۥ۟ۧۦ$ۥ;->ۥ:LYue/ۥ۟ۧۦ$ۥ;

    sput-object v0, LYue/ۥ۟ۧۦ;->ۥ:LYue/ۥ۟ۧۦ$ۥ;

    new-instance v0, LYue/ۥ۟ۧۦ$ۥ$ۥ;

    invoke-direct {v0}, LYue/ۥ۟ۧۦ$ۥ$ۥ;-><init>()V

    sput-object v0, LYue/ۥ۟ۧۦ;->ۥ۟:LYue/ۥ۟ۧۦ;

    return-void
.end method


# virtual methods
.method public abstract ۥ(LYue/ۥ۠ۤۨۥ;)Ljava/util/List;
    .param p1    # LYue/ۥ۠ۤۨۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e4\u06e8\u06e5;",
            ")",
            "Ljava/util/List<",
            "LYue/\u06e5\u06df\u06e7\u06e5\u06e8;",
            ">;"
        }
    .end annotation
.end method

.method public abstract ۥ۟(LYue/ۥ۠ۤۨۥ;Ljava/util/List;)V
    .param p1    # LYue/ۥ۠ۤۨۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e4\u06e8\u06e5;",
            "Ljava/util/List<",
            "LYue/\u06e5\u06df\u06e7\u06e5\u06e8;",
            ">;)V"
        }
    .end annotation
.end method
