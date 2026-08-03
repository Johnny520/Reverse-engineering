.class public final Lio/sentry/D0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/e0;


# static fields
.field public static final c:Ljava/nio/charset/Charset;


# instance fields
.field public final a:Lio/sentry/v2;

.field public final b:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lio/sentry/D0;->c:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>(Lio/sentry/v2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/D0;->a:Lio/sentry/v2;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lio/sentry/D0;->b:Ljava/util/HashMap;

    new-instance v0, Lio/sentry/clientreport/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/a;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/f;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/b;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/c;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/DebugImage;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/d;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/f;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/e;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/g;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/i;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/j;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/k;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/l;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/m;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/e1;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/f1;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/h1;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/i1;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/profilemeasurements/a;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/profilemeasurements/b;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/n;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/m1;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/protocol/D;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lio/sentry/protocol/D;-><init>(I)V

    const-class v1, Lio/sentry/rrweb/a;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/protocol/D;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lio/sentry/protocol/D;-><init>(I)V

    const-class v1, Lio/sentry/rrweb/c;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/protocol/D;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lio/sentry/protocol/D;-><init>(I)V

    const-class v1, Lio/sentry/rrweb/g;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/protocol/D;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lio/sentry/protocol/D;-><init>(I)V

    const-class v1, Lio/sentry/rrweb/i;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/protocol/D;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lio/sentry/protocol/D;-><init>(I)V

    const-class v1, Lio/sentry/rrweb/j;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/protocol/D;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lio/sentry/protocol/D;-><init>(I)V

    const-class v1, Lio/sentry/rrweb/l;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/protocol/D;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lio/sentry/protocol/D;-><init>(I)V

    const-class v1, Lio/sentry/rrweb/m;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/q;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/r;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/J1;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/Q1;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/R1;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/s;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/Z1;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/a2;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/b2;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/d2;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/u;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/v;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/x2;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/w;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/x;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/y;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/A1;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/z;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/A;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/F2;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/H2;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/K2;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/L2;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/protocol/D;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/sentry/protocol/D;-><init>(I)V

    const-class v1, Lio/sentry/protocol/E;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/protocol/h;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/e;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lio/sentry/e;-><init>(I)V

    const-class v1, Lio/sentry/S2;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/clientreport/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/sentry/clientreport/a;-><init>(I)V

    const-class v1, Lio/sentry/clientreport/b;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/protocol/D;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lio/sentry/protocol/D;-><init>(I)V

    const-class v1, Lio/sentry/protocol/G;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/sentry/protocol/D;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lio/sentry/protocol/D;-><init>(I)V

    const-class v1, Lio/sentry/protocol/F;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lio/sentry/D0;->a:Lio/sentry/v2;

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Lio/sentry/A0;

    invoke-direct {v2, p1}, Lio/sentry/A0;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object p1, p0, Lio/sentry/D0;->b:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/q0;

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    invoke-interface {p1, v2, v3}, Lio/sentry/q0;->a(Lio/sentry/A0;Lio/sentry/ILogger;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    invoke-virtual {v2}, Lio/sentry/A0;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :try_start_3
    invoke-virtual {p2}, Ljava/lang/Class;->isArray()Z

    move-result p1

    if-nez p1, :cond_2

    const-class p1, Ljava/util/Collection;

    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-nez p1, :cond_2

    const-class p1, Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-nez p1, :cond_2

    const-class p1, Ljava/util/Map;

    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    :try_start_4
    invoke-virtual {v2}, Lio/sentry/A0;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-object v1

    :cond_2
    :goto_1
    :try_start_5
    invoke-virtual {v2}, Lio/sentry/A0;->z()Ljava/lang/Object;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :goto_2
    :try_start_6
    invoke-virtual {v2}, Lio/sentry/A0;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p2

    :try_start_7
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    :goto_4
    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    sget-object v0, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Error when deserializing"

    invoke-interface {p2, v0, v2, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public final b(Ljava/util/concurrent/ConcurrentHashMap;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lio/sentry/D0;->f(Ljava/lang/Object;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/io/BufferedInputStream;)Lio/sentry/internal/debugmeta/c;
    .locals 3

    iget-object v0, p0, Lio/sentry/D0;->a:Lio/sentry/v2;

    :try_start_0
    invoke-virtual {v0}, Lio/sentry/v2;->getEnvelopeReader()Lio/sentry/Q;

    move-result-object v1

    invoke-interface {v1, p1}, Lio/sentry/Q;->a(Ljava/io/BufferedInputStream;)Lio/sentry/internal/debugmeta/c;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v1, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v2, "Error deserializing envelope."

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final d(Ljava/lang/Object;Ljava/io/BufferedWriter;)V
    .locals 5

    const-string v0, "The entity is required."

    invoke-static {v0, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lio/sentry/D0;->a:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    invoke-interface {v1, v2}, Lio/sentry/ILogger;->i(Lio/sentry/a2;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lio/sentry/v2;->isEnablePrettySerializationOutput()Z

    move-result v1

    invoke-virtual {p0, p1, v1}, Lio/sentry/D0;->f(Ljava/lang/Object;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v3

    const-string v4, "Serializing object: %s"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v3, v2, v4, v1}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    new-instance v1, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/v2;->getMaxDepth()I

    move-result v2

    invoke-direct {v1, p2, v2}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/io/Writer;I)V

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    iget-object v2, v1, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast v2, Lio/sentry/B0;

    invoke-virtual {v2, v1, v0, p1}, Lio/sentry/B0;->l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public final e(Lio/sentry/internal/debugmeta/c;Ljava/io/OutputStream;)V
    .locals 7

    const-string v0, "\n"

    iget-object v1, p0, Lio/sentry/D0;->a:Lio/sentry/v2;

    const-string v2, "The SentryEnvelope object is required."

    invoke-static {v2, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v2, Ljava/io/BufferedOutputStream;

    invoke-direct {v2, p2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    new-instance v3, Ljava/io/BufferedWriter;

    new-instance v4, Ljava/io/OutputStreamWriter;

    sget-object v5, Lio/sentry/D0;->c:Ljava/nio/charset/Charset;

    invoke-direct {v4, v2, v5}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v3, v4}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    :try_start_0
    iget-object v2, p1, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    check-cast v2, Lio/sentry/J1;

    new-instance v4, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v1}, Lio/sentry/v2;->getMaxDepth()I

    move-result v5

    invoke-direct {v4, v3, v5}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/io/Writer;I)V

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lio/sentry/J1;->serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V

    invoke-virtual {v3, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    iget-object p1, p1, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/P1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v2}, Lio/sentry/P1;->f()[B

    move-result-object v4

    iget-object v2, v2, Lio/sentry/P1;->a:Lio/sentry/Q1;

    new-instance v5, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v1}, Lio/sentry/v2;->getMaxDepth()I

    move-result v6

    invoke-direct {v5, v3, v6}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/io/Writer;I)V

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v6

    invoke-virtual {v2, v5, v6}, Lio/sentry/Q1;->serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V

    invoke-virtual {v3, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/Writer;->flush()V

    invoke-virtual {p2, v4}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v3, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception v2

    :try_start_2
    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v4

    sget-object v5, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v6, "Failed to create envelope item. Dropping it."

    invoke-interface {v4, v5, v6, v2}, Lio/sentry/ILogger;->r(Lio/sentry/a2;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/io/Writer;->flush()V

    return-void

    :goto_1
    invoke-virtual {v3}, Ljava/io/Writer;->flush()V

    throw p1
.end method

.method public final f(Ljava/lang/Object;Z)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    new-instance v1, Lio/sentry/internal/debugmeta/c;

    iget-object v2, p0, Lio/sentry/D0;->a:Lio/sentry/v2;

    invoke-virtual {v2}, Lio/sentry/v2;->getMaxDepth()I

    move-result v3

    invoke-direct {v1, v0, v3}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/io/Writer;I)V

    if-eqz p2, :cond_0

    const-string p2, "\t"

    invoke-virtual {v1, p2}, Lio/sentry/internal/debugmeta/c;->t(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v2}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object p2

    iget-object v2, v1, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    check-cast v2, Lio/sentry/B0;

    invoke-virtual {v2, v1, p2, p1}, Lio/sentry/B0;->l(Lio/sentry/internal/debugmeta/c;Lio/sentry/ILogger;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
