.class public final Lwc/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/util/List;

.field public d:Lme/a;

.field public e:Lme/a;

.field public f:Lae/g;

.field public g:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    iput-object v0, p0, Lwc/a;->c:Ljava/util/List;

    .line 7
    .line 8
    const-class v0, Lvc/a;

    .line 9
    .line 10
    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 11
    .line 12
    .line 13
    const-string v0, "dex-input.verify-checksum"

    .line 14
    .line 15
    iput-object v0, p0, Lwc/a;->a:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method
