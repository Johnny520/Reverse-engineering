.class public final LYue/ۥ۟۟ۡۢ$ۥ۟۟۟;
.super LYue/ۥ۟۟ۡۢ;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۡۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e1\u06e2<",
        "TE;>;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06df\u06e1\u06e2<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:I

.field public ۥ۟۟۠ۦ:I


# direct methods
.method public constructor <init>(LYue/ۥ۟۟ۡۢ;II)V
    .locals 1
    .param p1    # LYue/ۥ۟۟ۡۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06df\u06e1\u06e2<",
            "+TE;>;II)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LYue/ۥ۟۟ۡۢ;-><init>()V

    iput-object p1, p0, LYue/ۥ۟۟ۡۢ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡۢ;

    iput p2, p0, LYue/ۥ۟۟ۡۢ$ۥ۟۟۟;->ۥ۟۟۠ۥ:I

    sget-object v0, LYue/ۥ۟۟ۡۢ;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۢ$ۥ;

    invoke-virtual {p1}, LYue/ۥ۟۟۠ۦ;->size()I

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, LYue/ۥ۟۟ۡۢ$ۥ;->ۥ۟۟۟(III)V

    sub-int/2addr p3, p2

    iput p3, p0, LYue/ۥ۟۟ۡۢ$ۥ۟۟۟;->ۥ۟۟۠ۦ:I

    return-void
.end method


# virtual methods
.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    sget-object v0, LYue/ۥ۟۟ۡۢ;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۢ$ۥ;

    iget v1, p0, LYue/ۥ۟۟ۡۢ$ۥ۟۟۟;->ۥ۟۟۠ۦ:I

    invoke-virtual {v0, p1, v1}, LYue/ۥ۟۟ۡۢ$ۥ;->ۥ۟(II)V

    iget-object v0, p0, LYue/ۥ۟۟ۡۢ$ۥ۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡۢ;

    iget v1, p0, LYue/ۥ۟۟ۡۢ$ۥ۟۟۟;->ۥ۟۟۠ۥ:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, LYue/ۥ۟۟ۡۢ;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ()I
    .locals 1

    iget v0, p0, LYue/ۥ۟۟ۡۢ$ۥ۟۟۟;->ۥ۟۟۠ۦ:I

    return v0
.end method
