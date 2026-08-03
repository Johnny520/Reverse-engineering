.class public final Lh4/p;
.super Lh4/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final b:Lv4/c0;


# direct methods
.method public constructor <init>(Lv4/c0;)V
    .locals 1

    .line 1
    const-string v0, "SourceDebugExtension"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lh4/s;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lh4/p;->b:Lv4/c0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/p;->b:Lv4/c0;

    .line 2
    .line 3
    iget-object v0, v0, Lv4/c0;->h:Lg8/b;

    .line 4
    .line 5
    iget v0, v0, Lg8/b;->c:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x6

    .line 8
    .line 9
    return v0
.end method
