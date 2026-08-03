.class public final L۟/ha$a;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/ha;->ۥ۟ۧ()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "Ljava/lang/Boolean;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ:L۟/ha$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/ha$a;

    invoke-direct {v0}, L۟/ha$a;-><init>()V

    sput-object v0, L۟/ha$a;->ۥ:L۟/ha$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    sput-boolean p1, L۟/f5;->ۥ۟:Z

    .line 8
    .line 9
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 10
    .line 11
    return-object p1
.end method
