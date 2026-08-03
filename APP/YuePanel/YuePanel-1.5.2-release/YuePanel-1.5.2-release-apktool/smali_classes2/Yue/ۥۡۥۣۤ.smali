.class public interface abstract LYue/ۥۡۥۣۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۥۣۤ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ:LYue/ۥۡۥۣۤ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:LYue/ۥۡۥۣۤ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LYue/ۥۡۥۣۤ$ۥ;->ۥ:LYue/ۥۡۥۣۤ$ۥ;

    sput-object v0, LYue/ۥۡۥۣۤ;->ۥ:LYue/ۥۡۥۣۤ$ۥ;

    new-instance v0, LYue/ۥۡۥۣۤ$ۥ$ۥ;

    invoke-direct {v0}, LYue/ۥۡۥۣۤ$ۥ$ۥ;-><init>()V

    sput-object v0, LYue/ۥۡۥۣۤ;->ۥ۟:LYue/ۥۡۥۣۤ;

    return-void
.end method


# virtual methods
.method public abstract ۥ(ILjava/util/List;)Z
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e4\u06e2\u06e1;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract ۥ۟(ILYue/ۥۣۣ۟۠;IZ)Z
    .param p2    # LYue/ۥۣۣ۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract ۥ۟۟(ILjava/util/List;Z)Z
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e0\u06e4\u06e2\u06e1;",
            ">;Z)Z"
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟(ILYue/ۥ۠ۡ۠ۢ;)V
    .param p2    # LYue/ۥ۠ۡ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
.end method
