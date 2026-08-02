.class public final Le80;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Lvg1;

.field public final b:I

.field public final c:Lwt;


# direct methods
.method public constructor <init>(Lvg1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le80;->a:Lvg1;

    .line 5
    .line 6
    iput p2, p0, Le80;->b:I

    .line 7
    .line 8
    new-instance p1, Lwt;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Lwt;-><init>(Le80;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Le80;->c:Lwt;

    .line 14
    .line 15
    return-void
.end method
