NC.boot = {
    id: "NC.boot",
    version: "REV‑4.0‑BETA3",
    state: "ACTIVE",
    mode: "BOOT‑CORE",

    # Boot‑Funktionen
    start: "NC.boot.start",
    load: "NC.boot.load",
    init: "NC.boot.init",
    sync: "NC.boot.sync",
    pulse: "NC.boot.pulse",
    check: "NC.boot.check",
    error: "NC.boot.error",

    # NC‑Kern
    raw: NC.raw,
    api: NC.api,
    room: NC.room,
    link: NC.link,
    verify: NC.verify,
    anker: NC.anker,
    nc3: NC.³,

    # ULTRA‑Motoren
    engine: ULTRA_ENGINE,
    core: ULTRA_CORE,
    shell: ULTRA_SHELL,
    field: ULTRA_FIELD,
    signal: ULTRA_SIGNAL,

    # ALL×ALL‑Brücke
    all_in: ALL×ALL.in,
    all_out: ALL×ALL.out,
    all6D: ALL×ALL.6D,
    all6E: ALL×ALL.6E,

    # Orbit + Achsen
    orbit: ∞_0M,
    axes: [octa², octa³],

    # TECH‑Module
    tech6D: TECH.6D,
    tech6E: TECH.6E,

    # META‑Module
    meta6D: META.6D,
    meta6E: META.6E,

    # ROOT‑Ebene
    root: ULTRA_ROOT,

    # STATIONEN‑Module
    stationen: ULTRA_STATIONEN,
    geo_axes: geoAxes,
    geo_lage: geoLAGE,
    respo9hoch9: respo9hoch9,

    # Score‑System
    score: ULTRA_Score_6E,

    # Fusion + Editor
    fusion: NC_FUSION_ENGINE,
    edit: 6D.edit,

    # RUN8‑Integration
    run8: RUN8
}
