.class public final L۟/u5$k;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/u5;->ۥ۠۟(L۟/wb;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/f3<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/wb;


# direct methods
.method public constructor <init>(L۟/wb;)V
    .locals 0

    iput-object p1, p0, L۟/u5$k;->ۥ:L۟/wb;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 2

    .line 1
    sget v0, L۟/o;->ۥ:I

    .line 2
    .line 3
    iget-object v0, p0, L۟/u5$k;->ۥ:L۟/wb;

    .line 4
    .line 5
    iget-object v0, v0, L۟/wb;->ۥ۟ۡ:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, L۟/o;->ۥ(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, L۟/u5$k;->ۥ:L۟/wb;

    .line 11
    .line 12
    iget-object v0, v0, L۟/wb;->ۥ۟ۢ:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-static {v1, v0}, L۟/o;->ۥ۟ۨ(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    return-object v0
.end method
