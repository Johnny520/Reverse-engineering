.class public final L۟/c$a;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/c;->toString()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "TE;",
        "Ljava/lang/CharSequence;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u06df/c<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(L۟/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u06df/c<",
            "+TE;>;)V"
        }
    .end annotation

    iput-object p1, p0, L۟/c$a;->ۥ:L۟/c;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, L۟/c$a;->ۥ:L۟/c;

    if-ne p1, v0, :cond_0

    const-string p1, "(this Collection)"

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method
