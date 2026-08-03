.class public final LYue/ۥ۠ۥۦۤ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۥۦۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation


# static fields
.field public static final synthetic ۥ:LYue/ۥ۠ۥۦۤ$ۥ۟;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥ۠ۥۦۤ$ۥ۟;

    invoke-direct {v0}, LYue/ۥ۠ۥۦۤ$ۥ۟;-><init>()V

    sput-object v0, LYue/ۥ۠ۥۦۤ$ۥ۟;->ۥ:LYue/ۥ۠ۥۦۤ$ۥ۟;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(LYue/ۥۣ۠ۡ۟;)LYue/ۥ۠ۥۦۤ;
    .locals 1
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06e0\u06e5\u06e6\u06e4$\u06e5;",
            "LYue/\u06e5\u06e1\u06e6\u06e7;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e5\u06e6\u06e4;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۠ۥۦۤ$ۥ۟$ۥ;

    invoke-direct {v0, p1}, LYue/ۥ۠ۥۦۤ$ۥ۟$ۥ;-><init>(LYue/ۥۣ۠ۡ۟;)V

    return-object v0
.end method
