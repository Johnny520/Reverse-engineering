.class public LYue/ۥ۟ۧ۟ۡ$ۥ۟۟;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۧ۟ۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۟ۧ۟ۡ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧ۟ۡ;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۧ۟ۡ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧ۟ۡ;

    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    iput-object p2, p0, LYue/ۥ۟ۧ۟ۡ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IncorrectConstraintException: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟ۧ۟ۡ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۧ۟ۡ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    return-object v0
.end method
