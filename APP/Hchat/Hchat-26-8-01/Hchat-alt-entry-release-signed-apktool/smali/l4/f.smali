.class public final Ll4/f;
.super Ll4/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ll4/b;


# instance fields
.field public final e:Lw4/a;


# direct methods
.method public constructor <init>(Lv4/d0;ILv4/z;Lh4/u;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Ll4/e;-><init>(Lv4/d0;ILv4/z;Lh4/u;)V

    .line 2
    .line 3
    .line 4
    iget-object p4, p3, Lv4/z;->h:Lv4/c0;

    .line 5
    .line 6
    iget-object p4, p4, Lv4/c0;->g:Ljava/lang/String;

    .line 7
    .line 8
    iget-object p1, p1, Lv4/d0;->g:Lw4/c;

    .line 9
    .line 10
    and-int/lit8 p2, p2, 0x8

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p2, 0x0

    .line 17
    :goto_0
    iget-object p3, p3, Lv4/z;->g:Lv4/c0;

    .line 18
    .line 19
    iget-object p3, p3, Lv4/c0;->g:Ljava/lang/String;

    .line 20
    .line 21
    const-string v0, "<init>"

    .line 22
    .line 23
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    invoke-static {p4}, Lw4/a;->d(Ljava/lang/String;)Lw4/a;

    .line 28
    .line 29
    .line 30
    move-result-object p4

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    if-eqz p3, :cond_2

    .line 35
    .line 36
    const p2, 0x7fffffff

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p2}, Lw4/c;->d(I)Lw4/c;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :cond_2
    invoke-virtual {p4, p1}, Lw4/a;->e(Lw4/c;)Lw4/a;

    .line 44
    .line 45
    .line 46
    move-result-object p4

    .line 47
    :goto_1
    iput-object p4, p0, Ll4/f;->e:Lw4/a;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final a()Lw4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ll4/f;->e:Lw4/a;

    .line 2
    .line 3
    return-object v0
.end method
